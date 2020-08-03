package com.nsystem.travel.historydriver;

import com.nsystem.travel.base.BaseActivity;
import com.nsystem.travel.databinding.ActivityHistoryDriverBinding;

import android.view.View;

import javax.inject.Inject;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.hilt.android.AndroidEntryPoint;

/**
 * @author Putra Nugraha
 * @version HistoryDriverActivity, v 0.0.1 29/07/20 22.08 by Putra Nugraha
 */
@AndroidEntryPoint
public class HistoryDriverActivity extends BaseActivity {

    @Inject
    HistoryDriverAdapter historyDriverAdapter;

    @Inject
    LinearLayoutManager linearLayoutManager;

    @Inject
    ViewModelProvider viewModelProvider;

    private ActivityHistoryDriverBinding activityHistoryDriverBinding;

    @Override
    public View getView() {
        activityHistoryDriverBinding = ActivityHistoryDriverBinding.inflate(getLayoutInflater());
        return activityHistoryDriverBinding.getRoot();
    }

    @Override
    public void setup() {
        setupRecylerView();
        setupHistoryDriverViewModel();
    }

    private void setupRecylerView() {
        activityHistoryDriverBinding.rvHistoryDriver.setLayoutManager(linearLayoutManager);
        activityHistoryDriverBinding.rvHistoryDriver.setAdapter(historyDriverAdapter);
    }

    private void setupHistoryDriverViewModel() {
        viewModelProvider.get(HistoryDriverViewModel.class)
            .getHistoryDrivers()
            .observe(
                this,
                historyDriverResponses -> historyDriverAdapter.submitList(historyDriverResponses)
            );
    }
}
