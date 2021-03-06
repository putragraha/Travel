package com.nsystem.travel.historydriver;

import com.nsystem.data.driver.model.HistoryDriverResponse;
import com.nsystem.data.driver.repository.DriverEntityRepository;
import com.nsystem.travel.utils.AutoDisposeSingleObserver;
import com.nsystem.travel.utils.Transformer;

import android.app.Application;

import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/**
 * @author Putra Nugraha
 * @version HistoryDriverViewModel, v 0.0.1 19/07/20 19.57 by Putra Nugraha
 */
public class HistoryDriverViewModel extends AndroidViewModel {

    private MutableLiveData<List<HistoryDriverResponse>> historyDriverResponseLiveData =
        new MutableLiveData<>();

    private DriverEntityRepository driverEntityRepository;

    @Inject
    public HistoryDriverViewModel(
        @NonNull Application application,
        DriverEntityRepository driverEntityRepository
    ) {
        super(application);
        this.driverEntityRepository = driverEntityRepository;
        fetchHistoryDrivers();
    }

    public LiveData<List<HistoryDriverResponse>> getHistoryDrivers() {
        return historyDriverResponseLiveData;
    }

    private void fetchHistoryDrivers() {
        driverEntityRepository.getHistoryDrivers()
            .compose(Transformer::applySchedulers)
            .subscribe(new AutoDisposeSingleObserver<List<HistoryDriverResponse>>() {

                @Override
                public void onSuccess(List<HistoryDriverResponse> historyDriverResponses) {
                    super.onSuccess(historyDriverResponses);
                    historyDriverResponseLiveData.postValue(historyDriverResponses);
                }
            });
    }
}
