package com.nsystem.travel.homedriver;

import com.nsystem.travel.armadasetting.ArmadaSettingActivity;
import com.nsystem.travel.base.BaseActivity;
import com.nsystem.travel.databinding.ActivityHomeDriverBinding;
import com.nsystem.travel.historydriver.HistoryDriverActivity;

import android.view.View;

public class HomeDriverActivity extends BaseActivity {

    private ActivityHomeDriverBinding activityHomeDriverBinding;

    @Override
    public View getView() {
        activityHomeDriverBinding = ActivityHomeDriverBinding.inflate(getLayoutInflater());
        return activityHomeDriverBinding.getRoot();
    }

    @Override
    public void setup() {
        setupButtonArmadaSetting();
    }

    private void setupButtonArmadaSetting() {
        activityHomeDriverBinding.btnArmadaSetting.setOnClickListener(view ->
            startActivity(ArmadaSettingActivity.class)
        );
        activityHomeDriverBinding.btnHistory.setOnClickListener(view ->
            startActivity(HistoryDriverActivity.class)
        );
    }
}
