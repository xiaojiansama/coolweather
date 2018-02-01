package com.example.sama.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小贱`sama on 2018/2/1.
 */

public class Now {
    @SerializedName("tmp")
    public String tmp;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
