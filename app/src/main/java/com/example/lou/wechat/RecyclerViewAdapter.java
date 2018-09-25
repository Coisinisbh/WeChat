package com.example.lou.wechat;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

/**
 * Created by Lou on 2018/4/30.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private List<Inform> informList;
    public RecyclerViewAdapter(List<Inform> informList){
        this.informList = informList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_wechat,parent,false);
       final ViewHolder  holder = new ViewHolder(view);
       holder.newsView.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View view) {
             int position = holder.getAdapterPosition();
             Inform inform = informList.get(position);
               Toast.makeText(view.getContext(),"点击获得的内容:"+ inform,
                       Toast.LENGTH_SHORT).show();
           }
       } );
       holder.ivPhoto.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int pos = holder.getAdapterPosition();
               Inform inform = informList.get(pos);
               Toast.makeText(view.getContext(),"点击获得的内容:"+inform,
                       Toast.LENGTH_SHORT).show();
           }
       });

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       Inform inform = informList.get(position);
       holder.tvTitle.setText(inform.getTitle());
       holder.tvDesc.setText(inform.getDesc());
       holder.tvDate.setText(String.format(Locale.CHINA,"%tF %tT",inform.getPubTime(),
               inform.getPubTime()));
       holder.ivPhoto.setImageResource(inform.getImgId());
    }

    @Override
    public int getItemCount() {

        return informList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View newsView;
        TextView tvTitle;
        TextView tvDesc;
        TextView tvDate;
        ImageView ivPhoto;
        public ViewHolder(View itemView) {
            super(itemView);
            this.newsView = itemView ;
            tvTitle = itemView.findViewById(R.id.ni);
            tvDesc = itemView.findViewById(R.id.xiao);
            tvDate = itemView.findViewById(R.id.shijian);
            tvDesc = itemView.findViewById(R.id.xiao);
            tvDate = itemView.findViewById(R.id.shijian);
            ivPhoto = itemView .findViewById(R.id.news_photo );
        }
    }
}
