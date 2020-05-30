package com.example.pharases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void playPhrase(View view) {


        Button buttonPressed1 = (Button) findViewById(R.id.button1);
        Button buttonPressed2 = (Button) findViewById(R.id.button2);
        Button buttonPressed3 = (Button) findViewById(R.id.button3);
        Button buttonPressed4 = (Button) findViewById(R.id.button4);
        Button buttonPressed5 = (Button) findViewById(R.id.button5);
        Button buttonPressed6 = (Button) findViewById(R.id.button6);
        Button buttonPressed7 = (Button) findViewById(R.id.button7);
        Button buttonPressed8 = (Button) findViewById(R.id.button8);

        buttonPressed1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.hello);
                mediaPlayer.start();
            }
        });
        buttonPressed2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.howareyou);
                mediaPlayer.start();
            }
        });
        buttonPressed3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.nicetomeetyou);
                mediaPlayer.start();
            }
        });
        buttonPressed4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.whatisyourname);
                mediaPlayer.start();
            }
        });
        buttonPressed5.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.howold);
                mediaPlayer.start();
            }
        });
        buttonPressed6.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.where);
                mediaPlayer.start();
            }
        });

        buttonPressed7.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.french);
                mediaPlayer.start();
            }
        });
        buttonPressed8.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.english);
                mediaPlayer.start();
            }
        });






    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
