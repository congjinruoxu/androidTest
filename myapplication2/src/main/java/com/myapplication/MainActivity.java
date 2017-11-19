package com.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mDataBinding;
    private NewUser mNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mDataBinding.setUser(new UserInfo("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg", "李四"));
        mNewUser = new NewUser("新的名字","19");
        mDataBinding.setUser2(mNewUser);
        mDataBinding.setMain(this);
    }

    public void myClick(View view) {
        Toast.makeText(this, "点击了", Toast.LENGTH_LONG).show();
        Log.i("xoo", "myClick: ");
        mNewUser.setAge("91");
    }
}
