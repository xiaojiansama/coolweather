package com.example.sama.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小贱`sama on 2018/2/1.
 */

public class AQI {
    @SerializedName("city")
    public AQICity city;
    public class AQICity{
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }

}
