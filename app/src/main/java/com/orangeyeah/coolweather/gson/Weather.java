package com.orangeyeah.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 创建日期:2017/1/3/0003
 * 公司:OrangeYeah
 * 作者:李楠
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
