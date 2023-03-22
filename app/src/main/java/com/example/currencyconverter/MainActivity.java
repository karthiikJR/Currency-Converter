package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    /*
     * usd - 0.012
     * pound - 0.0099
     * yen - 1.60
     * euro - 0.011
     * riyal - 0.045
     */


    double con;

    public void currClick(View view) {

        Spinner spinner = findViewById(R.id.spinnerCurrList);
        String currType = spinner.getSelectedItem().toString();

        try {
            EditText et = findViewById(R.id.eTCurr);
            int curr =Integer.parseInt(et.getText().toString());

            switch (currType) {
                case "Dollar" :
                    con = curr*0.012;
                    Toast.makeText(this, "₹"+ curr +" is $"+ con, Toast.LENGTH_LONG).show();
                    break;
                case "Pound" :
                    con = curr*0.0099;
                    Toast.makeText(this, "₹"+ curr +" is £"+ con, Toast.LENGTH_LONG).show();
                    break;
                case "Yen" :
                    con = curr*1.60;
                    Toast.makeText(this, "₹"+ curr +" is ¥"+ con, Toast.LENGTH_LONG).show();
                    break;
                case "Euro" :
                    con = curr*0.011;
                    Toast.makeText(this, "₹"+ curr +" is €"+ con, Toast.LENGTH_LONG).show();
                    break;
                case "Riyal" :
                    con = curr*0.045;
                    Toast.makeText(this, "₹"+ curr +" is SAR "+ con, Toast.LENGTH_LONG).show();
                    break;
                default:
                    Toast.makeText(this, "Enter proper one", Toast.LENGTH_LONG).show();
            }
        }
        catch (Exception e) {
            Toast.makeText(this, "Enter valid number :)", Toast.LENGTH_LONG).show();
        }



        //Log.e("btn", String.valueOf(curr));
        Log.e("currType", currType);


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