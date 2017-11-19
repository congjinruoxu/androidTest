package com.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Administrator on 2017/11/19.
 */

public class NewUser extends BaseObservable{
    private String name;
    private String age;

    public NewUser(String name, String age) {
        this.name = name;
        this.age = age;
    }
@Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
     notifyPropertyChanged(BR.name);
    }
}
