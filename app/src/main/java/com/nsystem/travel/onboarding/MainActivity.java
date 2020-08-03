package com.nsystem.travel.onboarding;

import com.nsystem.travel.logindriver.LoginDriverActivity;
import com.nsystem.travel.base.BaseActivity;
import com.nsystem.travel.databinding.ActivityMainBinding;
import com.nsystem.travel.loginuser.LoginUserActivity;

import android.view.View;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    public View getView() {
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        return activityMainBinding.getRoot();
    }

    @Override
    public void setup() {
        setupButtonLoginDriver();
        setupButtonUserDriver();
    }

    private void setupButtonLoginDriver() {
        activityMainBinding.btnLoginDriver.setOnClickListener(
            view -> startActivity(LoginDriverActivity.class)
        );
    }

    private void setupButtonUserDriver() {
        activityMainBinding.btnLoginUser.setOnClickListener(
            view -> startActivity(LoginUserActivity.class)
        );
    }
}