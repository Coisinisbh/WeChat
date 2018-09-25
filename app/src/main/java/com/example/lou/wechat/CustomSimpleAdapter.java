package com.example.lou.wechat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Lou on 2018/4/25.
 */

public class CustomSimpleAdapter extends SimpleAdapter {
    private List<HashMap<String, Object>> datas;

    public CustomSimpleAdapter(Context context, List<HashMap<String, Object>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
        this.datas = data;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder holder;
        if (convertView == null) {
            view = super.getView(position, convertView, parent);
            holder = new ViewHolder();
            holder.tvTitle = view.findViewById(R.id.ni);
            holder.tvDesc = view.findViewById(R.id.xiao );
            holder.tvDate = view.findViewById(R.id.shijian );
            holder.ivphoto = view.findViewById(R.id.news_photo);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }
        HashMap<String, Object> news = datas.get(position);
        holder.tvTitle.setText(news.get("title").toString());
        holder.tvDesc.setText(news.get("desc").toString());
        holder.tvDate.setText(news.get("time").toString());
        holder.ivphoto.setImageResource(Integer.valueOf(news.get("img").toString()));

        return view;
    }

     class ViewHolder {
        TextView tvTitle;
        TextView tvDesc;
        TextView tvDate;
        ImageView ivphoto;

    }
}