package com.zed.retrocloudantmvp.views.main.fragmentone;


import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.zed.retrocloudantmvp.R;
import com.zed.retrocloudantmvp.data.db.cloudant_ds.model.Products;

import java.util.List;

/**
 * Created by airfi on 05/12/17.
 */

public class FragmentOne extends Fragment implements FragmentOneContract.IFragmentOneView {


    FragmentOnePresenter fragmentOnePresenter = null;
    GridView gridView = null;
    List<Products> productsList = null;

    String androidId = null;

    public FragmentOne() {
        //dsdhdhjks
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        androidId = Settings.Secure.getString(getActivity().getContentResolver(),
                Settings.Secure.ANDROID_ID);

        Log.d("TAG SERIAL NUMBER", "" + androidId);
        Toast.makeText(getActivity(), androidId, Toast.LENGTH_LONG).show();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, container, false);

        gridView = (GridView) view.findViewById(R.id.gridView);

        fragmentOnePresenter = new FragmentOnePresenter(getActivity().getApplicationContext(), this);

        fragmentOnePresenter.onCreate();

        fragmentOnePresenter.loadGridValues("DAIRY PRODUCTS");


        //  gridView.setAdapter(new ItemsGridAdapter(productsList,R.id.gridCard,getActivity().getApplicationContext()));


        return view;
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void loadGridView(List<Products> list) {

        productsList = list;
        gridView.setAdapter(new ItemsListAdapter(productsList, R.layout.grid_card, getActivity().getApplicationContext()));
        Log.d("LIST", "" + list.size());

    }
}

