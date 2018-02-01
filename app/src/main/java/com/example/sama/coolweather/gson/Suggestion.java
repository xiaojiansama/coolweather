package com.example.sama.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小贱`sama on 2018/2/1.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public Carwash carwash;
    public class Carwash{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("sport")
    public Sport sport;
    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
