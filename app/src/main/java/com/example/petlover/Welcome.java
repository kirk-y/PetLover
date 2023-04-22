package com.example.petlover;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.example.petlover.LoginRegister.Preload;

import java.util.Timer;
import java.util.TimerTask;

public class Welcome extends AppCompatActivity {

    TimerTask task=new TimerTask(){
        @Override
        public void run(){
            final Intent localIntent=new Intent(Welcome.this, Home.class);
            startActivity(localIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);

        Timer timer=new Timer();
        int WAIT_TIME = 1000;
        timer.schedule(task, WAIT_TIME);
    }

}