package com.example.h071221024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class SocialMediaActivity extends AppCompatActivity {

    Button btnWhatsApp,btnInstagram,btnLinkedIn,btnGithub;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        btnWhatsApp = findViewById(R.id.btn_whatsapp);
        btnInstagram = findViewById(R.id.btn_ig);
        btnLinkedIn = findViewById(R.id.btn_linkedin);
        btnGithub = findViewById(R.id.btn_github);

        btnWhatsApp.setOnClickListener( v -> {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/+628871293167"));
            startActivity(intent);
        });
        btnInstagram.setOnClickListener( v -> {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/rsydbmstya/"));
            startActivity(intent);
        });
        btnLinkedIn.setOnClickListener( v -> {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/rasyad-bimasatya/"));
            startActivity(intent);
        });
        btnGithub.setOnClickListener( v -> {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/RasyadBima15"));
            startActivity(intent);
        });
    }
}