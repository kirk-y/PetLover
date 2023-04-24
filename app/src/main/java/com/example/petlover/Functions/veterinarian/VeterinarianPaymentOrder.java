package com.example.petlover.Functions.veterinarian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petlover.R;

public class VeterinarianPaymentOrder extends AppCompatActivity {

    public static VeterinarianPaymentOrder instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinarin_payment_order);

        instance = this;

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button bnt_veterinarian_checkout = findViewById(R.id.bnt_veterinarian_checkout);
        bnt_veterinarian_checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VeterinarianPaymentOrder.this, VeterinarianSuccedPayment.class);
                startActivity(intent);
                finish();
            }
        });
    }
}