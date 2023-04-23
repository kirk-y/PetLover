package com.example.petlover.Functions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.petlover.Functions.veterinarian.VeterinarianInfo;
import com.example.petlover.R;

public class Veterinarian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinarian);

        ImageButton bnt_veterinarian_info = findViewById(R.id.bnt_veterinarian_info);
        bnt_veterinarian_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Veterinarian.this, VeterinarianInfo.class);
                startActivity(intent);
            }
        });
    }
}