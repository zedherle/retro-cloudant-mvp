package com.zed.retrocloudantmvp.views.main.fragmentone;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zed.retrocloudantmvp.R;
import com.zed.retrocloudantmvp.data.db.cloudant_ds.model.Products;

import java.util.List;

/**
 * Created by airfi on 05/12/17.
 */

public class ItemsGridAdapter extends RecyclerView.Adapter<ItemsGridAdapter.GridItemsHolder> {

    private List<Products> productsList = null;
    private int gridItem;
    private Context context;

    public ItemsGridAdapter(List<Products> productsList, int gridItem, Context context) {
        this.productsList = productsList;
        this.gridItem = gridItem;
        this.context = context;
    }

    @Override
    public GridItemsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(gridItem, parent, false);
        return new ItemsGridAdapter.GridItemsHolder(view);
    }

    @Override
    public void onBindViewHolder(GridItemsHolder holder, int position) {

        holder.textview.setText(productsList.get(position).getBarcode());
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }


    public static class GridItemsHolder extends RecyclerView.ViewHolder {

        TextView textview = null;

        public GridItemsHolder(View itemView) {
            super(itemView);
            textview = (TextView) itemView.findViewById(R.id.description);
        }
    }
}
