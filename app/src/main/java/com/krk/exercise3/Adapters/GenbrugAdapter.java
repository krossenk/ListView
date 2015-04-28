package com.krk.exercise3.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.krk.exercise3.Model.GenbrugItem;
import com.krk.exercise3.R;

import java.util.ArrayList;

/**
 * Created by Rossen on 21/04/15.
 */
public class GenbrugAdapter extends BaseAdapter {
    Context context;
    ArrayList<GenbrugItem> genbrugList;
    GenbrugItem genbrugItem;

    public GenbrugAdapter(final Context newContext, final ArrayList<GenbrugItem> newGenbrugList) {
        this.context = newContext;
        this.genbrugList = newGenbrugList;
    }


    @Override
    public int getCount() {
        if(genbrugList != null) {
            return genbrugList.size();
        } else {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        if(genbrugList!=null) {
            return genbrugList.get(position);
        } else {
            return null;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater genbrugInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = genbrugInflater.inflate(R.layout.genbrug_item, null);
        }

        genbrugItem = genbrugList.get(position);
        if(genbrugItem != null) {
            TextView txtName = (TextView) convertView.findViewById(R.id.tv_item_name);
            txtName.setText(genbrugItem.getItemName());

            TextView txtDesc = (TextView) convertView.findViewById(R.id.tv_desc);
            txtDesc.setText(genbrugItem.getDescription());

            ImageView imageView = (ImageView) convertView.findViewById(R.id.iv_item);
            if(genbrugItem == null)
            {
                imageView.setImageResource(R.drawable.img);
            } else {
                imageView.setImageResource(genbrugItem.getImageId());
            }
        }
        return convertView;
    }
}
