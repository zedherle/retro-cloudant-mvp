package com.zed.retrocloudantmvp.views.main.fragmentone;

import android.content.Context;

import com.cloudant.sync.documentstore.DocumentStoreException;
import com.zed.retrocloudantmvp.data.db.cloudant_ds.CloudantHelper;
import com.zed.retrocloudantmvp.data.db.cloudant_ds.model.Products;

import java.util.List;

/**
 * Created by airfi on 05/12/17.
 */

public class FragmentOnePresenter implements FragmentOneContract.IFragmentOnePresenter {

    CloudantHelper cloudantHelper = null;
    private Context context = null;
    private FragmentOneContract.IFragmentOneView iFragmentOneView = null;

    public FragmentOnePresenter(Context context, FragmentOneContract.IFragmentOneView iFragmentOneView) {
        this.context = context;
        this.iFragmentOneView = iFragmentOneView;
    }

    @Override
    public void onCreate() {

        cloudantHelper = CloudantHelper.getInstance(context);
    }

    @Override
    public void onDestroy() {

    }


    @Override
    public void loadGridValues(String filterCategory) {

        try {
            List<Products> productList = cloudantHelper.searchByCategory(filterCategory);
            if (productList != null)
                iFragmentOneView.loadGridView(productList);
        } catch (DocumentStoreException e) {
            e.printStackTrace();
        }
    }
}
