package com.zed.retrocloudantmvp.views.main;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.cloudant.sync.event.Subscribe;
import com.cloudant.sync.event.notifications.ReplicationCompleted;
import com.cloudant.sync.event.notifications.ReplicationErrored;
import com.zed.retrocloudantmvp.R;
import com.zed.retrocloudantmvp.data.network.model.ItemsResponse;
import com.zed.retrocloudantmvp.views.main.fragmentone.FragmentOne;
import com.zed.retrocloudantmvp.views.main.fragmenttwo.FragmentTwo;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.IMainView {

    FragmentOne fragmentOne;
    private TextView responseText;
    private MainContract.IMainPresenter presenter = null;
    private RecyclerView recyclerView;
    private ViewPager viewPager = null;
    private ViewPagerAdapter viewPagerAdapter = null;
    private TabLayout tabLayout = null;

    @Override
    protected void onStart() {
        super.onStart();


    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_pager_new);

        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new FragmentOne(), "CAT# 1");
        viewPagerAdapter.addFragment(new FragmentTwo(), "CAT# 2");


        viewPager.setAdapter(viewPagerAdapter);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


        presenter = new MainPresenter(this, getApplicationContext());
        //   recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //  presenter.onCreate();
        //  presenter.getProductMasterCount();
//        presenter.getItemList();
        //  presenter.startReplicationProcess();

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void showItemList(List<ItemsResponse.Row> list) {

        // recyclerView.setAdapter(new ItemsAdpater(list, R.layout.card_item, getApplicationContext()));

    }

    @Override
    public void showRecords(long records) {
        // responseText.setText("So far synced records are : " + records);
    }

    @Subscribe
    public void complete(ReplicationCompleted rc) {
        Log.e("MAIN ACTIVITY", "Replication Completed:" + rc);

    }

    @Subscribe
    public void error(ReplicationErrored re) {
        Log.e("MAIN ACTIVITY", "Replication error:", re.errorInfo);

    }

}
