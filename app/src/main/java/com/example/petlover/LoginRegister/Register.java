package com.example.petlover.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petlover.R;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // 检测注册界面的Register按钮，点击后跳转到Login，
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button bnt_register = findViewById(R.id.bnt_reg_reg);
        bnt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("user register");
                Intent intent = new Intent(Register.this, VerifyIdentity.class);
                startActivity(intent);
                finish();
                finish();
            }
        });

    }
}