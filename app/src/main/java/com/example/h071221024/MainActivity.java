package com.example.h071221024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBio;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBio = findViewById(R.id.btn_bio);

        btnBio.setOnClickListener( v -> {
            intent = new Intent(MainActivity.this, BioActivity.class);
            startActivity(intent);
        });
    }
}