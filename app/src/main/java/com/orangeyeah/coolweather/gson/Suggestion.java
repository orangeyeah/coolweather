package com.orangeyeah.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建日期:2017/1/3/0003
 * 公司:OrangeYeah
 * 作者:李楠
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
