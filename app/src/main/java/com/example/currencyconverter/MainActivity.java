package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    double con;

    public void currClick(View view) {

        EditText et = (EditText) findViewById(R.id.eTCurr);
        int curr =Integer.parseInt(et.getText().toString());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* adding elements to spinner
        1. Create a spinner obj
        2. Create a array list
        3. Add required elements
        4. We use ArrayAdapter to attach the ArrayList
        5. Add it to spinner
        */

        Spinner spinner = findViewById(R.id.spinnerCurrList);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dollar");
        arrayList.add("Pound");
        arrayList.add("Yen");
        arrayList.add("Euro");
        arrayList.add("Riyal");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

    }
}