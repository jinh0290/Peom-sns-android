package com.hongdroid.viewpagerexample.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hongdroid.viewpagerexample.R;

public class Frag2 extends Fragment {
    private View view;

    public static Frag2 newInstance() {
        Frag2 frag2 = new Frag2();
        return frag2;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag2, container, false);

        return view;
    }
}
