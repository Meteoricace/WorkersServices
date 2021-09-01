package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class details extends AppCompatActivity {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        button1 = findViewById(R.id.details_button_next);
        button1. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openPersonal();

            }
        });
    }
    public void openPersonal() {
        Intent intent = new Intent(this, personalData1.class);
        startActivity(intent);
    }
}