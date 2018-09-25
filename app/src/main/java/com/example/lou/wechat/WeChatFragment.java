package com.example.lou.wechat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeChatFragment extends Fragment {
    private List<Inform> informList;

    public WeChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        initDate();
        View view =  inflater.inflate(R.layout.fragment_we_chat, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.Wechat_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(informList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void initDate() {
          informList = new ArrayList<>();
          informList.add(new Inform("昵称","消息",new Date(),R.mipmap.ic_launcher_round));
          informList.add(new Inform("昵称","消息",new Date(),R.mipmap.ic_launcher_round));
          informList.add(new Inform("昵称","消息",new Date(),R.mipmap.ic_launcher_round));
        informList.add(new Inform("昵称","消息",new Date(),R.mipmap.ic_launcher_round));
        informList.add(new Inform("昵称","消息",new Date(),R.mipmap.ic_launcher_round));
        informList.add(new Inform("昵称","消息",new Date(),R.mipmap.ic_launcher_round));
        informList.add(new Inform("昵称","消息",new Date(),R.mipmap.ic_launcher_round));
        informList.add(new Inform("昵称","消息",new Date(),R.mipmap.ic_launcher_round));
        informList.add(new Inform("昵称","消息",new Date(),R.mipmap.ic_launcher_round));
    }

}
