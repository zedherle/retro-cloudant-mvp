package com.zed.retrocloudantmvp.views.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zed.retrocloudantmvp.R;
import com.zed.retrocloudantmvp.data.network.model.ItemsResponse;

import java.util.List;

/**
 * Created by Sanjay Herle on 30-11-2017.
 */

public class ItemsAdpater extends RecyclerView.Adapter<ItemsAdpater.ItemsHolder> {

    private List<ItemsResponse.Row> items;
    private int rowLayout;
    private Context context;

    public ItemsAdpater(List<ItemsResponse.Row> items, int rowLayout, Context context) {
        this.items = items;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public ItemsAdpater.ItemsHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout,parent,false);
        return new ItemsHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemsAdpater.ItemsHolder holder, int position) {

        holder.textview.setText(items.get(position).getDoc().getBarcode());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ItemsHolder extends RecyclerView.ViewHolder{

        TextView textview = null;

        public ItemsHolder(View itemView) {
            super(itemView);
            textview = (TextView)itemView.findViewById(R.id.card_barcode);
        }
    }
}
