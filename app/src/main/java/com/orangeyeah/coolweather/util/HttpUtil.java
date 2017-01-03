package com.orangeyeah.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 创建日期:2016/12/27/0027
 * 公司:OrangeYeah
 * 作者:李楠
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
