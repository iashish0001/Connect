package com.example.all;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


            class Number {


                int number;

                public boolean isSquare(){

                    double squareroot = Math.sqrt(number);

                    if (squareroot ==  Math.floor(squareroot)){

                        return true;

                    } else {

                        return false;
                    }
                }
                public boolean isTriangular(){

                    int x = 1;

                    int triangularNumber = 1;

                    while (triangularNumber < number) {

                        x++;

                        triangularNumber = triangularNumber + x;

                    }

                    if (triangularNumber == number){

                        return true;

                    } else {

                        return false;
                    }
                }



            }




    public void testnumber(View view) {

        Log.i("INFO", "Button pressed");
        EditText editText = (EditText) findViewById(R.id.editText);
        String message;
        if (editText.getText().toString().isEmpty()){
            message = "Please enter a number";

        } else {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(editText.getText().toString());

            if (myNumber.isSquare() && myNumber.isTriangular()) {
                message = editText.getText().toString() + " is  Square and Triangular ";

            } else if (myNumber.isSquare()) {

                message = editText.getText().toString() + " is Square Number";
            } else if (myNumber.isTriangular()) {
                message = editText.getText().toString() + " is Triangular Number";
            } else {
                message = editText.getText().toString() + " is neither Triangular nor Square Number";
            }
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
