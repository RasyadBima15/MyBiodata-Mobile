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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout btnHome, btnBio,btnSosmed, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerlayout);
        menu = findViewById(R.id.menu);
        btnBio = findViewById(R.id.btn_bio);
        btnSosmed = findViewById(R.id.btn_sosmed);
        btnContact = findViewById(R.id.btn_contact);
        btnHome = findViewById(R.id.btn_home);

        menu.setOnClickListener( v -> {
            openDrawer(drawerLayout);
        });
        btnHome.setOnClickListener( v -> {
            recreate();
        });
        btnBio.setOnClickListener( v -> {
            redirectActivity(this, BioActivity.class);
        });
        btnSosmed.setOnClickListener( v -> {
            redirectActivity(this, SocialMediaActivity.class);
        });
        btnContact.setOnClickListener( v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081153506535"));
            startActivity(intent);
        });
    }
    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public static void closeDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public static void redirectActivity(Activity activity, Class secondActivity ){
        Intent intent = new Intent(activity, secondActivity);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        activity.finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        closeDrawer(drawerLayout);
    }
}