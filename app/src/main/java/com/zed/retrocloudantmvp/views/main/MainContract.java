package com.zed.retrocloudantmvp.views.main;

import com.zed.retrocloudantmvp.data.network.model.ItemsResponse;
import com.zed.retrocloudantmvp.views.base.BaseContract;

import java.util.List;

/**
 * Created by Sanjay Herle on 02-12-2017.
 */

public interface MainContract {

    interface IMainView extends BaseContract.IBaseView {

        void showItemList(List<ItemsResponse.Row> list);

        void showRecords(long records);

    }

    interface IMainPresenter extends BaseContract.IBasePresenter {

        void getItemList();

        void startReplicationProcess();

        void getProductMasterCount();
    }

}
