package com.lovcreate.service.datasource;

/**
 * Created by gaobo on 2016/11/25.
 */

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSources extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceSwitch.getDataSourceType();
    }

}