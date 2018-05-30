package com.example.roshan.design_safeperiods;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        int[] Icons = new int[]{
                R.drawable.ic_home_24dp,
                R.drawable.ic_blog4dp,
                R.drawable.ic_tips24dp,
                R.drawable.ic_history_black_24dp
        };
        viewPager = (ViewPager) findViewById(R.id.container);


        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Home").setIcon(Icons[0]));
        tabLayout.addTab(tabLayout.newTab().setText("Blog").setIcon(Icons[1]));
        tabLayout.addTab(tabLayout.newTab().setText("Tips").setIcon(Icons[2]));
        tabLayout.addTab(tabLayout.newTab().setText("History").setIcon(Icons[3]));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(getResources().getColor(R.color.black),
                getResources().getColor(R.color.black));

        MyCustomerAdapter adapter = new MyCustomerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);



        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }


    class MyCustomerAdapter extends FragmentPagerAdapter {

        public MyCustomerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new FragmentHome();
                    break;

                case 1:
                    fragment = new FragmentBlog();
                    break;

                case 2:
                    fragment = new FragmentTips();
                    break;

                case 3:
                    fragment = new FragmentHistory();

            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }


}






