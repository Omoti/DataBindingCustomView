package com.example.databindingcustomview;

import android.databinding.BindingAdapter;
import android.graphics.Color;
import android.util.Log;
import android.widget.TextView;

/**
 * Binding用属性定義
 */

public class BindingAdapters {
    @BindingAdapter("user_data")
    public static void setUser(UserInfoView view, User user) {
        Log.d("DEBUG", "set user @BindingAdapter");

        view.setUser(user);
    }

    @BindingAdapter("user_data")
    public static void setUser(TextView view, User user) {
        Log.d("DEBUG", "set user @BindingAdapter");

        if (user.getAge() >= 30) {
            view.setTextColor(Color.RED);
        }else{
            view.setTextColor(Color.BLACK);
        }
    }
}
