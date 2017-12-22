package com.zed.retrocloudantmvp.views.main.fragmentone;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zed.retrocloudantmvp.R;
import com.zed.retrocloudantmvp.data.db.cloudant_ds.model.Products;

import java.util.List;

/**
 * Created by airfi on 05/12/17.
 */

public class ItemsListAdapter extends BaseAdapter {

    private List<Products> productsList = null;
    private int gridItem;
    private Context context;
    private TextView textView = null;

    public ItemsListAdapter(List<Products> productsList, int gridItem, Context context) {
        this.productsList = productsList;
        this.gridItem = gridItem;
        this.context = context;
    }

    @Override
    public int getCount() {
        return productsList.size();
    }

    @Override
    public Object getItem(int position) {
        return productsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            grid = inflater.inflate(R.layout.grid_card, null);
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_card, parent, false);
            textView = (TextView) grid.findViewById(R.id.description);
            String productName = productsList.get(position).getDescription();
            Log.d("Item List Adpater", productName);
            textView.setText(productName);

        } else {
            grid = convertView;
        }

        return grid;
    }
}
