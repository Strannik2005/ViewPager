package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.recyclerview.Fragments.FirstFragment;
import com.example.recyclerview.Fragments.SecondFragment;
import com.example.recyclerview.Fragments.ThirdFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);


        tabLayout.setupWithViewPager(viewPager);
        adapter = new MainAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new FirstFragment(), "Fragment 1");
        adapter.addFragment(new SecondFragment(), "Fragment 2");
        adapter.addFragment(new ThirdFragment(), "Fragment 3");
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
    }
}