package com.example.sama.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.concurrent.locks.Condition;

/**
 * Created by 小贱`sama on 2018/2/1.
 */

public class Forecast {
    @SerializedName("date")
    public String date;

    public class Cond{
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("cond")
    public Cond cond;

    public class Tmp{
        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }

    @SerializedName("tmp")
    public Tmp tmp;
}
