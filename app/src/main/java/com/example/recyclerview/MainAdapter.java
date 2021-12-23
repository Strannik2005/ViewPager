package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.recyclerview.Fragments.FirstFragment;
import com.example.recyclerview.Fragments.SecondFragment;
import com.example.recyclerview.Fragments.ThirdFragment;

import java.util.ArrayList;

public class MainAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> frArray = new ArrayList<>();
    private final ArrayList<String> frTextArray = new ArrayList<>();

    public MainAdapter(@NonNull FragmentManager fm, int b) {
        super(fm, b);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return frArray.get(position);
    }


    @Override
    public int getCount() {
        return frArray.size();
    }

    public void addFragment(Fragment fr, String str){
        frArray.add(fr);
        frTextArray.add(str);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return frTextArray.get(position);
    }
}
