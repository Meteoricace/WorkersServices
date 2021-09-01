package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class personalData1 extends AppCompatActivity {
    private Spinner spinner;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data1);
        getSupportActionBar().setTitle("personal data and location");

        button1 = findViewById(R.id.personal_data_button_Submit);
        spinner= findViewById(R.id.spinner);
        List<String> categories = new ArrayList<>();
        categories.add(0,"choose Governorate");
        categories.add("Cairo");
        categories.add("Dakahlia");
        categories.add("Damietta");
        categories.add("Faiyum");
        categories.add("Alexandria");
        categories.add("Giza");
        categories.add("Luxor");
        categories.add("Port Said");
        categories.add("Sharqia");
        categories.add("Sohag");
        categories.add("Aswan");
        categories.add("Asyut");
        categories.add("Gharbia");
        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapterView.getItemAtPosition(i).equals("choose category"))
                {

                }
                else
                {
                    String item = adapterView.getItemAtPosition(i).toString();
                    Toast.makeText(adapterView.getContext(), "selected"+item, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFinish();
            }
        });
    }
    public void openFinish() {
        Intent intent = new Intent(this, finish.class);
        startActivity(intent);
    }
}