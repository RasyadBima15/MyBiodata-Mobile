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

public class BioActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout btnHome, btnBio,btnSosmed, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        drawerLayout = findViewById(R.id.drawerlayout);
        menu = findViewById(R.id.menu);
        btnBio = findViewById(R.id.btn_bio);
        btnSosmed = findViewById(R.id.btn_sosmed);
        btnContact = findViewById(R.id.btn_contact);
        btnHome = findViewById(R.id.btn_home);

        menu.setOnClickListener( v -> {
            MainActivity.openDrawer(drawerLayout);
        });
        btnHome.setOnClickListener( v -> {
            MainActivity.redirectActivity(this, MainActivity.class);
        });
        btnBio.setOnClickListener( v -> {
            recreate();
        });
        btnSosmed.setOnClickListener( v -> {
            MainActivity.redirectActivity(this, SocialMediaActivity.class);
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