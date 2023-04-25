package com.example.petlover.Functions;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.petlover.Functions.Adopte.PetMap;
import com.example.petlover.R;

public class Adoption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoption);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton bnt_adoption_pet1 = findViewById(R.id.bnt_adoption_pet1);
        bnt_adoption_pet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adoption.this, PetMap.class);
                startActivity(intent);
            }
        });

    }
}