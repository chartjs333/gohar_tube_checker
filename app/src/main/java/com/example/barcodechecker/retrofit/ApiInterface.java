package com.example.barcodechecker.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("remove")
    Call<Void> remove(@Query("remove") Long id);
}
