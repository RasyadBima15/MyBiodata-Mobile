package com.example.h071221024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SocialMediaActivity extends AppCompatActivity {

    Button btnWhatsApp,btnInstagram,btnLinkedIn,btnGithub;
    Intent intent;

    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout btnHome, btnBio,btnSosmed, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        btnWhatsApp = findViewById(R.id.btn_whatsapp);
        btnInstagram = findViewById(R.id.btn_ig);
        btnLinkedIn = findViewById(R.id.btn_linkedin);
        btnGithub = findViewById(R.id.btn_github);

        drawerLayout = findViewById(R.id.drawerlayout);
        menu = findViewById(R.id.menu);
        btnBio = findViewById(R.id.btn_bio);
        btnSosmed = findViewById(R.id.btn_sosmed);
        btnContact = findViewById(R.id.btn_contact);
        btnHome = findViewById(R.id.btn_home);

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

        menu.setOnClickListener( v -> {
            MainActivity.openDrawer(drawerLayout);
        });
        btnHome.setOnClickListener( v -> {
            MainActivity.redirectActivity(this, MainActivity.class);
        });
        btnBio.setOnClickListener( v -> {
            MainActivity.redirectActivity(this, BioActivity.class);
        });
        btnSosmed.setOnClickListener( v -> {
            recreate();
        });
        btnContact.setOnClickListener( v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081153506535"));
            startActivity(intent);
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        MainActivity.closeDrawer(drawerLayout);
    }
}