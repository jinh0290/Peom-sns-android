package com.hongdroid.viewpagerexample.ExtraTabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hongdroid.viewpagerexample.MyWritings_recycler.MyWritingsAdapter;
import com.hongdroid.viewpagerexample.MyWritings_recycler.MyWritingsData;
import com.hongdroid.viewpagerexample.R;

import java.util.ArrayList;

public class MyWritingsActivity extends AppCompatActivity {
    private View view;

    // tab3 recyclerview에서 사용
    private ArrayList<MyWritingsData> arrayList;
    private MyWritingsAdapter myWritingsAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;


    public static MyWritingsActivity newInstance() {
        MyWritingsActivity fragWednesday = new MyWritingsActivity();
        return fragWednesday;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_writings);


        //tab3 recyclerview
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();

        myWritingsAdapter = new MyWritingsAdapter(arrayList);
        recyclerView.setAdapter(myWritingsAdapter);

        //recyclerview object 추가 기능
        Button btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyWritingsData tab3Data = new MyWritingsData("채우다", "하나이면\n 둘을 원하고 \n\n 둘이면\n 셋을 원하네", "[호루라기]", "2020년 08월 01일, 밤");
                arrayList.add(tab3Data);
                myWritingsAdapter.notifyDataSetChanged();
            }
        });
    }
}
