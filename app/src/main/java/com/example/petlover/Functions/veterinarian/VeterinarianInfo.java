package com.example.petlover.Functions.veterinarian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petlover.R;

public class VeterinarianInfo extends AppCompatActivity {

    public static VeterinarianInfo instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinarian_info);

        instance = this;

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button bnt_create_appointment = findViewById(R.id.bnt_create_appointment);
        bnt_create_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VeterinarianInfo.this, VeterinarianAppointment.class);
                startActivity(intent);
            }
        });
    }
}