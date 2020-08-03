package com.nsystem.travel.homeuser;

import com.nsystem.travel.base.BaseActivity;
import com.nsystem.travel.databinding.ActivityHomeUserBinding;

import android.view.View;

public class HomeUserActivity extends BaseActivity {

    private ActivityHomeUserBinding activityHomeUserBinding;

    @Override
    public View getView() {
        activityHomeUserBinding = ActivityHomeUserBinding.inflate(getLayoutInflater());
        return activityHomeUserBinding.getRoot();
    }

    @Override
    public void setup() {
        // No implementation
    }
}
