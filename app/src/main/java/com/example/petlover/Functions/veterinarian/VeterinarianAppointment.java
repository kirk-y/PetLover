package com.example.petlover.Functions.veterinarian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petlover.R;

public class VeterinarianAppointment extends AppCompatActivity {

    public static VeterinarianAppointment instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veteranarin_appointment);

        instance = this;

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button veteran_confirm_appointment = findViewById(R.id.veteran_confirm_appointment);
        veteran_confirm_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VeterinarianAppointment.this, VeterinarianPaymentOrder.class);
                startActivity(intent);
            }
        });
    }
}