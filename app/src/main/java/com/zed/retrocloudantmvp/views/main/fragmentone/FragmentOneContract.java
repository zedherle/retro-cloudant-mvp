package com.zed.retrocloudantmvp.views.main.fragmentone;

import com.zed.retrocloudantmvp.data.db.cloudant_ds.model.Products;
import com.zed.retrocloudantmvp.views.base.BaseContract;

import java.util.List;

/**
 * Created by airfi on 05/12/17.
 */

public interface FragmentOneContract {

    public interface IFragmentOneView extends BaseContract.IBaseView {

        public void loadGridView(List<Products> list);
    }

    public interface IFragmentOnePresenter extends BaseContract.IBasePresenter {

        public void loadGridValues(String filterCategory);
    }

}
