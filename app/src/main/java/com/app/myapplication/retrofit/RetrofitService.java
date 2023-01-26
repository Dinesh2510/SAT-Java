package com.app.myapplication.retrofit;


import com.app.myapplication.retrofit.Response.ResponseGame;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
//sapk01222019186652.json
    @GET("nzin01312019187360.json")
    Call<ResponseGame> getGameData();

}

