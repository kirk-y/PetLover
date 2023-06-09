package com.example.petlover;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.petlover.Functions.Adoption;
import com.example.petlover.Functions.ItemInfo;
import com.example.petlover.Functions.Shop;
import com.example.petlover.Functions.DIY;
import com.example.petlover.Functions.Veterinarian;
import com.example.petlover.personal.PersonalHome;

public class Home extends AppCompatActivity {

    public static Home instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        instance = this;
        try{
            Welcome.instance.finish();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        @SuppressLint("WrongViewCast") ImageButton bnt_shop = findViewById(R.id.bnt_home_shop);
        bnt_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Shop.class);
                startActivity(intent);
            }
        });

        @SuppressLint("WrongViewCast") ImageButton bnt_adoption = findViewById(R.id.bnt_home_adoption);
        bnt_adoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Adoption.class);
                startActivity(intent);
            }
        });

        @SuppressLint("WrongViewCast") ImageButton bnt_veterinarian = findViewById(R.id.bnt_home_veterinarian);
        bnt_veterinarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Veterinarian.class);
                startActivity(intent);
            }
        });

        @SuppressLint("WrongViewCast") ImageButton bnt_treatment = findViewById(R.id.bnt_home_treatment);
        bnt_treatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, DIY.class);
                startActivity(intent);
            }
        });

        @SuppressLint("WrongViewCast") ImageButton bnt_profile = findViewById(R.id.profile_image);
        bnt_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PersonalHome.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"WrongViewCast", "MissingInflatedId", "LocalSuppress"})
        ImageButton bnt_home_pet1 = findViewById(R.id.bnt_home_pet1);
        bnt_home_pet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ItemInfo.class);
                startActivity(intent);
            }
        });

    }
}