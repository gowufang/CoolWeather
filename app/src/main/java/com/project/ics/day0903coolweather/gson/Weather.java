package com.project.ics.day0903coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 */

public class Weather {



/*
* 返回的天
气数据中还会包含一项status数据， 成功返回ok， 失败则会返回具体的
原因， 那么这里也需要添加一个对应的status 字段。*/
    public String status;



    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    /* 其中， 由于daily_forecast 中包含的是一
个数组， 因此这里使用了List集合来引用Forecast 类。 */
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
