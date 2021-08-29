package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SlideActivity extends AppCompatActivity {
    public static ViewPager viewPager;
    SlideViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        viewPager = findViewById(R.id.viewpager);
        adapter = new SlideViewPagerAdapter(this);
        viewPager.setAdapter(adapter);
        getSupportActionBar().hide();
    }

}