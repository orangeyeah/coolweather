package com.orangeyeah.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建日期:2017/1/3/0003
 * 公司:OrangeYeah
 * 作者:李楠
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
