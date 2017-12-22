package com.zed.retrocloudantmvp.views.main.fragmenttwo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zed.retrocloudantmvp.R;

/**
 * Created by airfi on 05/12/17.
 */

public class FragmentTwo extends Fragment {


    public FragmentTwo() {
        //dsdhdhjks
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2, container, false);

        return view;
    }

}

