package com.example.databindingcustomview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.example.databindingcustomview.databinding.ViewUserInfoBinding;

/**
 * ユーザー情報
 */

public class UserInfoView extends LinearLayout {
    ViewUserInfoBinding mBinding;

    public UserInfoView(Context context){
        super(context);
    }

    public UserInfoView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater inflater = LayoutInflater.from(context);
        mBinding = DataBindingUtil.inflate(inflater, R.layout.view_user_info, this, true);
    }

    public void setUser(User user) {
        Log.d("DEBUG", "set user @UserInfoView");

        mBinding.setUser(user);
    }
}
