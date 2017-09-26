package com.project.ics.day0903coolweather.gson;

/**
 * Created by Administrator on 2017/9/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }

}
