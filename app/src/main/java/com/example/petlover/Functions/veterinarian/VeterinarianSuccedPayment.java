package com.example.petlover.Functions.veterinarian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petlover.Functions.Veterinarian;
import com.example.petlover.Home;
import com.example.petlover.R;

public class VeterinarianSuccedPayment extends AppCompatActivity {

    public static VeterinarianSuccedPayment instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinarian_succed_payment);

        instance = this;

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button bnt_veterinarian_to_home = findViewById(R.id.bnt_veterinarian_to_home);
        bnt_veterinarian_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(VeterinarianSuccedPayment.this, Home.class);
//                startActivity(intent);
                VeterinarianAppointment.instance.finish();
                VeterinarianPaymentOrder.instance.finish();
                VeterinarianInfo.instance.finish();
                Veterinarian.instance.finish();
                finish();
            }
        });
    }
}