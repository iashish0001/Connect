package com.example.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void currencyconverter(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        Log.i("INFO" ,"pressed");


        String amountindollar = editText.getText().toString();
        double amountindollarDouble = Double.parseDouble(amountindollar);

        double amountininrDouble  = amountindollarDouble * 75;
        String amountininrString = String.format("%.2f", amountininrDouble);


        Toast.makeText(this, "$" + amountindollar + "is ₹" + amountininrString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
