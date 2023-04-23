package com.example.petlover.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petlover.R;

public class VerifyIdentity extends AppCompatActivity {

    public static VerifyIdentity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_identity);

        instance = this;

        Button bnt_reg_verify = findViewById(R.id.bnt_reg_verify);
        bnt_reg_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyIdentity.this, Login.class);
                startActivity(intent);
//                intent = new Intent(VerifyIdentity.this, Preload.class);
//                startActivity(intent);
                finish();
            }
        });
    }
}