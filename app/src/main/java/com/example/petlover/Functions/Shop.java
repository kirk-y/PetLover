package com.example.petlover.Functions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.petlover.Functions.shop.ShopPet;
import com.example.petlover.Functions.shop.ShopProduct;
import com.example.petlover.LoginRegister.Preload;
import com.example.petlover.LoginRegister.PreloadFragment.View1;
import com.example.petlover.LoginRegister.PreloadFragment.View2;
import com.example.petlover.LoginRegister.PreloadFragment.View3;
import com.example.petlover.R;

import java.util.List;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(R.layout.activity_shop);

        // 初始化ViewPager和FragmentPagerAdapter
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ViewPager viewPager = findViewById(R.id.shop_fragment);
        FragmentPagerAdapter fragmentPagerAdapter = new Shop.MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);

        ImageButton bnt_shop_back = findViewById(R.id.bnt_shop_back);
        bnt_shop_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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
                    return new ShopProduct();
                case 1:
                    return new ShopPet();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // 返回Fragment的数量
            return 2;
        }
    }
}