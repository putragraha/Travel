package com.nsystem.travel.common;

import com.nsystem.travel.historydriver.HistoryDriverViewModel;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 * @author Putra Nugraha
 * @version ViewModelFactory, v 0.0.1 31/07/20 10.11 by Putra Nugraha
 */
public class ViewModelFactory implements ViewModelProvider.Factory {

    private HistoryDriverViewModel historyDriverViewModel;

    @Inject
    public ViewModelFactory(HistoryDriverViewModel historyDriverViewModel) {
        this.historyDriverViewModel = historyDriverViewModel;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(HistoryDriverViewModel.class)) {
            //noinspection unchecked
            return (T) historyDriverViewModel;
        }

        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
