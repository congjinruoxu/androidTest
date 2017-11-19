package com.myapplication;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2017/11/19.
 */

public class UserInfo {
    private String username;
    private String userface;

    public UserInfo() {
    }

    public UserInfo(String userface, String username) {
        this.userface = userface;
        this.username = username;
    }

    @BindingAdapter("userface")
    public static void getInternetImage(ImageView iv, String userface) {
        Picasso.with(iv.getContext()).load(userface).into(iv);
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
