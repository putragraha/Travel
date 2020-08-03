package com.nsystem.data.driver.repository;

import com.nsystem.data.driver.repository.source.DriverEntity;
import com.nsystem.data.driver.repository.source.MockDriverEntity;

import javax.inject.Inject;

/**
 * @author Putra Nugraha
 * @version DriverEntityFactory, v 0.0.1 19/07/20 15.25 by Putra Nugraha
 */
public class DriverEntityFactory {

    private MockDriverEntity mockDriverEntity;

    @Inject
    public DriverEntityFactory(MockDriverEntity mockDriverEntity) {
        this.mockDriverEntity = mockDriverEntity;
    }

    public DriverEntity createDriverEntity() {
        return mockDriverEntity;
    }
}
