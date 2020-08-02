package com.hongdroid.viewpagerexample.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hongdroid.viewpagerexample.tab3_recycler.Tab3Adapter;
import com.hongdroid.viewpagerexample.tab3_recycler.Tab3Data;
import com.hongdroid.viewpagerexample.R;

import java.util.ArrayList;

public class Frag3 extends Fragment {
    private View view;

    // tab3 recyclerview에서 사용
    private ArrayList<Tab3Data> arrayList;
    private Tab3Adapter tab3Adapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    //


    public static Frag3 newInstance() {
        Frag3 fragWednesday = new Frag3();
        return fragWednesday;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag3, container, false);

        //tab3 recyclerview
        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();

        tab3Adapter = new Tab3Adapter(arrayList);
        recyclerView.setAdapter(tab3Adapter);

        //recyclerview object 추가 기능
        Button btn_add = (Button) view.findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tab3Data tab3Data = new Tab3Data("채우다", "하나이면\n 둘을 원하고 \n\n 둘이면\n 셋을 원하네", "[호루라기]", "2020년 08월 01일, 밤");
                arrayList.add(tab3Data);
                tab3Adapter.notifyDataSetChanged();
            }
        });


        return view;
    }
}
