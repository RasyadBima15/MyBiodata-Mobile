package com.example.h071221024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BioActivity extends AppCompatActivity {

    Button btnBack;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

//        btnBack = findViewById(R.id.btn_back);
//        btnBack.setOnClickListener( v->{
//            intent = new Intent(BioActivity.this, MainActivity.class);
//            startActivity(intent);
//        });
    }
}