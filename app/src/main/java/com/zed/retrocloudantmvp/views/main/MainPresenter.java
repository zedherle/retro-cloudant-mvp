package com.zed.retrocloudantmvp.views.main;

import android.content.Context;
import android.util.Log;

import com.cloudant.sync.documentstore.DocumentStoreException;
import com.zed.retrocloudantmvp.data.db.cloudant_ds.CloudantHelper;
import com.zed.retrocloudantmvp.data.network.APIEndpointInterface;
import com.zed.retrocloudantmvp.data.network.model.ItemsResponse;

import java.net.URISyntaxException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Sanjay Herle on 02-12-2017.
 */

public class MainPresenter implements MainContract.IMainPresenter{

    APIEndpointInterface apiEndpointInterface;
    CloudantHelper cloudantHelper = null;
    MainContract.IMainView iMainView = null;
    Context context = null;


    public MainPresenter(MainContract.IMainView iMainView, Context context) {

        this.iMainView = iMainView;
        this.context=context;
    }

    @Override
    public void onCreate() {

        //  apiEndpointInterface = APIClient.getClient().create(APIEndpointInterface.class);
        cloudantHelper = CloudantHelper.getInstance(context);

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void getItemList() {

        Call<ItemsResponse> call = apiEndpointInterface.getItems();
        call.enqueue(new Callback<ItemsResponse>() {
            @Override
            public void onResponse(Call<ItemsResponse> call, Response<ItemsResponse> response) {


                Log.d("TAG", response.message() + "");

                //    String displayResponse = "";

                ItemsResponse resource = response.body();
                List<ItemsResponse.Row> datumList = resource.getRows();

                iMainView.showItemList(datumList);
               //
                for (ItemsResponse.Row datum : datumList) {
                    //  displayResponse += datum.id + " " + datum.name + " " + datum.pantoneValue + " " + datum.year + "\n";
                    Log.d("Barcode", datum.getDoc().getBarcode() + "");
                    Log.d("Brand", datum.getDoc().getBrand() + "");
                    Log.d("Description", datum.getDoc().getDescription() + "");
                    Log.d("MRP", datum.getDoc().getProdMrp() + "");
                }


//                Log.d("TAG", resource.brand + "");
//                List<Items.rows> datumList = resource.data;
//
//                Log.d("TAG", resource.getBarcode() + "");
//                Log.d("TAG", resource.getBrand() + "");
//                Log.d("TAG", resource.getProdMrp() + "");

                // displayResponse += text + " Page\n" + total + " Total\n" + totalPages + " Total Pages\n";

//                for (Doc docs : d) {
//                    displayResponse += datum.id + " " + datum.name + " " + datum.pantoneValue + " " + datum.year + "\n";
//                }
            }

            public void onFailure(Call<ItemsResponse> call, Throwable t) {

                Log.d("TAG", t.getMessage() + "");
                call.cancel();
            }
        });

    }

    @Override
    public void startReplicationProcess() {
        try {
            cloudantHelper.reloadReplicationSettings();

        } catch (URISyntaxException e) {
            Log.e("MAIN PRESENTER", "Unable to construct remote URI from configuration", e);
        }

    }


    @Override
    public void getProductMasterCount() {
        try {
            long count = cloudantHelper.allDocumentCounts();
            iMainView.showRecords(count);
        } catch (DocumentStoreException e) {
            e.printStackTrace();
        }
    }
}
