package com.example.connect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 0 is for zero and 1 is for cross and 2 is empty

    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};


    int activePlayer = 0;
    boolean gameActive = true;

    public void dropin(View view) {
        ImageView counter = (ImageView) view;
        Log.i("Tag", counter.getTag().toString());

        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        if (gameState [tappedCounter] == 2 && gameActive){

            gameState[tappedCounter] = activePlayer;

            counter.setTranslationY(-1500);
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.zero);
                activePlayer = 1;

            } else {
                counter.setImageResource(R.drawable.cross);
                activePlayer = 0;
            }
            counter.animate().translationYBy(1500).setDuration(300);

            for (int[] winningPosition : winningPositions) {

                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[0]] != 2) {
                    // someone has won

                    gameActive = false;
                    String winner = "";
                    if (activePlayer == 1) {
                        winner = "zero";
                    } else {
                        winner = "cross";
                    }


                    Button button = (Button) findViewById(R.id.button);
                    TextView textView = (TextView) findViewById(R.id.textView);
                    textView.setText(winner + " has won.");
                    button.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);

                }

            }


        }


    }

    public void playAgain(View view) {



            Button button = (Button) findViewById(R.id.button);

        TextView textView = (TextView) findViewById(R.id.textView);

        button.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);

        GridLayout gridLayout =  findViewById(R.id.gridLayout);
        try {
            System.out.println("asdf gh "+gridLayout.getChildCount());


            for (int i = 0; i < gridLayout.getChildCount(); i++) {
            ImageView counter = (ImageView) gridLayout.getChildAt(i);
            counter.setImageDrawable(null);
        }

        for (int i = 0; i < gameState.length; i++) {

            gameState[i] = 2;
        }

        activePlayer = 0;
        gameActive = true;
    }

    catch (Exception e){
        Log.e("asdf", e.getLocalizedMessage());
    }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
