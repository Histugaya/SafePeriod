package com.example.roshan.design_safeperiods;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPageAdapter extends FragmentPagerAdapter {
    //integer to count number of tabs
   int tabCount;

    public SectionsPageAdapter (FragmentManager fm) {
        super(fm);
       this.tabCount = tabCount;

    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
        switch (position) {
            case 0:
       //         HomeFragment homeFragment = new HomeFragment();
                new FragmentHome();
                break;

            case 1:
                  new FragmentBlog();
                break;

            case 2:
                new FragmentTips();
                break;

            case 3:
                new FragmentHistory();
                break;
        }
        return null;

    }

    @Override
    public int getCount() {
        return 2;
    }

}