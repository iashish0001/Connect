package com.example.notepad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    static ArrayAdapter arrayAdapter;
    static ArrayList<String> notes = new ArrayList<String>();
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         sharedPreferences = getApplicationContext().getSharedPreferences("com.example.notepad", Context.MODE_PRIVATE);


        listView = findViewById(R.id.listView);


        notes.add("Example Note");
         arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, notes);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),noteeditor.class);
                intent.putExtra("noteId", i);
                startActivity(intent);
            }
        });
            listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                    final int itemToDelete = i;

                    new AlertDialog.Builder(MainActivity.this)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setTitle("Alert..")
                            .setMessage("Delete Selected ?")
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    notes.remove(itemToDelete);
                                    arrayAdapter.notifyDataSetChanged();

                                    HashSet<String> set = new HashSet<>(MainActivity.notes);
                                    sharedPreferences.edit().putStringSet("notes",set).apply();


                                }
                            })
                            .setNegativeButton("No", null)
                            .show();


                    return false;
                }
            });


    }

    // Menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.note_menu,menu);

        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);
         if (item.getItemId() == R.id.newnote) {
             Intent intent = new Intent(getApplicationContext(), noteeditor.class);
             startActivity(intent);
                return true;


         }
         return false;
    }
}