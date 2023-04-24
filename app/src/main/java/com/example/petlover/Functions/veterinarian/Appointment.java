package com.example.petlover.Functions.veterinarian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petlover.R;

public class Appointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button veteran_confirm_appointment = findViewById(R.id.veteran_confirm_appointment);
        veteran_confirm_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Appointment.this, Veterinarian_Payment_Order.class);
                startActivity(intent);
            }
        });
    }
}