package com.hongdroid.viewpagerexample.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hongdroid.viewpagerexample.R;

public class Frag3 extends Fragment {
    private View view;

    public static Frag3 newInstance() {
        Frag3 fragWednesday = new Frag3();
        return fragWednesday;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag3, container, false);

        return view;
    }
}
