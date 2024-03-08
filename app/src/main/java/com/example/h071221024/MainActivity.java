package com.example.h071221024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBio,btnSocmed, btnContact;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBio = findViewById(R.id.btn_bio);
        btnSocmed = findViewById(R.id.btn_socmed);
        btnContact = findViewById(R.id.btn_contact);

        btnBio.setOnClickListener( v -> {
            intent = new Intent(MainActivity.this, BioActivity.class);
            startActivity(intent);
        });
        btnSocmed.setOnClickListener( v -> {
            intent = new Intent(MainActivity.this, SocialMediaActivity.class);
            startActivity(intent);
        });
        btnContact.setOnClickListener( v -> {
            intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081153506535"));
            startActivity(intent);
        });
    }
}