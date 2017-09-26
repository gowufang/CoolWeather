package com.project.ics.day0903coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/7.
 */

public class County extends DataSupport {
    private int id;


    private String countryName;
    private String weatherId;

    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countryName;
    }

    public void setCountyName(String countryName) {
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
