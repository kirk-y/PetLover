package com.example.petlover.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.petlover.Home;
import com.example.petlover.LoginRegister.Login;
import com.example.petlover.LoginRegister.Preload;
import com.example.petlover.R;

public class PersonalHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_home);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton bnt_back = findViewById(R.id.bnt_personal_home_back);
        bnt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button bnt_editProfile = findViewById(R.id.bnt_edit_profile);
        bnt_editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalHome.this, EditProfile.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button bnt_fqa = findViewById(R.id.bnt_FAQ);
        bnt_fqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalHome.this, FQA.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button logout = findViewById(R.id.bnt_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalHome.this, Preload.class);
                startActivity(intent);
                Home.instance.finish();
                finish();
            }
        });
    }
}