package com.example.petlover.Functions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.petlover.Functions.diy.DiyCommunication;
import com.example.petlover.R;

public class DIY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diy);

        ImageButton bnt_diy_communication = findViewById(R.id.bnt_diy_communication);
        bnt_diy_communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DIY.this, DiyCommunication.class);
                startActivity(intent);
            }
        });
    }
}