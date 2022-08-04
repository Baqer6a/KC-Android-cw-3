package com.example.ambapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TV1 = findViewById(R.id.TV1);
        TextView TV2 = findViewById(R.id.TV2);
        EditText ETP1 = findViewById(R.id.ETP1);
        EditText ETO2 = findViewById(R.id.ETP2);
        Button B1 = findViewById(R.id.B1);


    }
}