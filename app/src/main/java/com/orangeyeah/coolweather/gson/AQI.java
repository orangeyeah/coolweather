package com.orangeyeah.coolweather.gson;

/**
 * 创建日期:2017/1/3/0003
 * 公司:OrangeYeah
 * 作者:李楠
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }

}
