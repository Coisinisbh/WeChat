package com.example.lou.wechat;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.RadioGroup;

public class WeiActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    private SparseArray<Fragment> fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wei);

        RadioGroup group = findViewById(R.id.btn_group);
        group.setOnCheckedChangeListener(this);

        fragments = new SparseArray<>();
        fragments.put(R.id.btn_weixin, new WeChatFragment());
        fragments.put(R.id.btn_tong, new AddressFragment());
        fragments.put(R.id.btn_fa, new FriendFragment());
        fragments.put(R.id.btn_wo, new SettingFragment());
        replaceFragment(fragments.get(R.id.btn_weixin));
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.content_layout, fragment);
        transaction.commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add, menu);
        return true;
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i){
        replaceFragment(fragments.get(i));
    }
}
