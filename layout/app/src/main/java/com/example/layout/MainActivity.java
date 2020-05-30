package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view){

        Log.i("INFO", "IMAGE CLICKED");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);

        if (bartIsShowing) {

            bartIsShowing = false;
            imageView.animate().alpha(0).setDuration(2000);
            imageView1.animate().alpha(1).setDuration(2000);
        } else {
            bartIsShowing = true;
            imageView.animate().alpha(1).setDuration(2000);
            imageView1.animate().alpha(0).setDuration(2000);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
