package com.example.petlover.Functions.veterinarian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petlover.Functions.Veterinarian;
import com.example.petlover.R;

public class VeterinarianInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinarian_info);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button bnt_create_appointment = findViewById(R.id.bnt_create_appointment);
        bnt_create_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VeterinarianInfo.this, Appointment.class);
                startActivity(intent);
            }
        });
    }
}