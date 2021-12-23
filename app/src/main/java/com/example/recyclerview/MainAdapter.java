package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.recyclerview.Fragments.FirstFragment;
import com.example.recyclerview.Fragments.SecondFragment;
import com.example.recyclerview.Fragments.ThirdFragment;

public class MainAdapter extends FragmentPagerAdapter {



    public MainAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();

        }
        return new FirstFragment();

    }

    @Override
    public int getCount() {
        return 3;
    }
}
