package com.lovcreate.service.datasource;

/**
 * Created by gaobo on 2016/11/25.
 */
public class DataSourceSwitch {

    private static final ThreadLocal contextHolder = new ThreadLocal();

    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return (String) contextHolder.get();
    }

    public static void clearDataSourceType() {
        contextHolder.remove();
    }
}
