package com.nsystem.data.driver.repository;

import com.nsystem.data.driver.model.HistoryDriverResponse;

import java.util.List;

import io.reactivex.rxjava3.core.Single;

/**
 * @author Putra Nugraha
 * @version DriverRepository, v 0.0.1 19/07/20 14.18 by Putra Nugraha
 */
public interface DriverRepository {

    Single<List<HistoryDriverResponse>> getHistoryDrivers();
}
