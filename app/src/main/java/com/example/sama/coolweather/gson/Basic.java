package com.example.sama.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小贱`sama on 2018/2/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
