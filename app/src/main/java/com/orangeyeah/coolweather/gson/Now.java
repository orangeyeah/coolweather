package com.orangeyeah.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建日期:2017/1/3/0003
 * 公司:OrangeYeah
 * 作者:李楠
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
