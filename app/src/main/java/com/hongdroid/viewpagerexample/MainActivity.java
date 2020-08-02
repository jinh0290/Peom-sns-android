package com.hongdroid.viewpagerexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.hongdroid.viewpagerexample.ExtraTabs.FollowingActivity;
import com.hongdroid.viewpagerexample.ExtraTabs.LikeActivity;
import com.hongdroid.viewpagerexample.ExtraTabs.MyWritingsActivity;
import com.hongdroid.viewpagerexample.ExtraTabs.ShowWritingActivity;
import com.hongdroid.viewpagerexample.tabs.ViewPagerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // viewpager에 사용
    private FragmentPagerAdapter fragmentPagerAdapter;

    // navigation menu에 사용
    private DrawerLayout drawerLayout;
    private View drawerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);


        // navigation menu 여는 코드
        ImageButton btn_open = (ImageButton)findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        LinearLayout my_writing = (LinearLayout) findViewById(R.id.my_writing);
        LinearLayout my_like = (LinearLayout) findViewById(R.id.my_like);
        LinearLayout my_following = (LinearLayout) findViewById(R.id.my_following);

        my_writing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MyWritingsActivity.class);
                startActivity(intent);
            }
        });

        my_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LikeActivity.class);
                startActivity(intent);
            }
        });

        my_following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FollowingActivity.class);
                startActivity(intent);
            }
        });


        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });

        // viewpager 세팅
        ViewPager viewPager = findViewById(R.id.viewPager);
        fragmentPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }


    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        // slide 했을때 호출됨.
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        // 열었을때 호출됨.
        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        // 닫혔을 때 호출됨.
        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };


}
