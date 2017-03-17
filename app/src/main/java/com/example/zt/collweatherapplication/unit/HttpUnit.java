package com.example.zt.collweatherapplication.unit;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public class HttpUnit {

    public   static   void  sendOkHttpRequest(String address,okhttp3.Callback callback)
    {

        OkHttpClient  okHttpClient=new OkHttpClient();
        Request  request=new Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
