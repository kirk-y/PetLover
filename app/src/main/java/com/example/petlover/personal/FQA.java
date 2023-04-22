package com.example.petlover.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.petlover.R;

public class FQA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fqa);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton bnt_fqa_back = findViewById(R.id.bnt_fqa_back);
        bnt_fqa_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}