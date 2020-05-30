package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);
        final ArrayList<String> mycircle = new ArrayList<String>();

        mycircle.add("Ashish");
        mycircle.add("Golu");
        mycircle.add("Laddu");
        mycircle.add("kittu");
        mycircle.add("choti");
        mycircle.add("tuktuk");
        mycircle.add("gungun");
        mycircle.add("pucho");
        mycircle.add("mikku");
        mycircle.add("hang");
        mycircle.add("ly");
        mycircle.add("my");
        mycircle.add("hana");
        mycircle.add("ankit");
        mycircle.add("yash");
        mycircle.add("tanu");
        mycircle.add("aman");
        mycircle.add("Ashmith");
        mycircle.add("Anurag");
        mycircle.add("Ashish");
        mycircle.add("Ashish");
        mycircle.add("Ashish");
        mycircle.add("Ashish");
        mycircle.add("Ashish");
        mycircle.add("Ashish");
        mycircle.add("Ashish");
        mycircle.add("Ashish");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mycircle);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext() , "Hello " + mycircle.get(i), Toast.LENGTH_LONG).show();

            }
        });






    }
}
