package com.example.petlover.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petlover.Home;
import com.example.petlover.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        try {
            VerifyIdentity.instance.finish();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button bnt_login = findViewById(R.id.bnt_login_login);
        bnt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Home.class);
                startActivity(intent);
                try {
                    Preload.instance.finish();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finish();
            }
        });
    }
}