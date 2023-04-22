package com.example.petlover.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.petlover.LoginRegister.PreloadFragment.View1;
import com.example.petlover.LoginRegister.PreloadFragment.View2;
import com.example.petlover.LoginRegister.PreloadFragment.View3;
import com.example.petlover.R;

import java.util.ArrayList;
import java.util.List;

public class Preload extends AppCompatActivity {

    private ViewPager viewPager;
    private FragmentPagerAdapter fragmentPagerAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preload);

        // 初始化ViewPager和FragmentPagerAdapter
        viewPager = findViewById(R.id.preload_fragment);
        fragmentPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        // user click login
        Button bnt_login = findViewById(R.id.bnt_preload_login);
        bnt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("user login");
            }
        });

        // user click register
        Button bnt_register = findViewById(R.id.bnt_preload_register);
        bnt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("user register");
                Intent intent = new Intent(Preload.this, Register.class);
                startActivity(intent);
            }
        });

    }
    private static class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // 根据位置返回对应的Fragment
            switch (position) {
                case 0:
                    return new View1();
                case 1:
                    return new View2();
                case 2:
                    return new View3();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // 返回Fragment的数量
            return 3;
        }
    }
}