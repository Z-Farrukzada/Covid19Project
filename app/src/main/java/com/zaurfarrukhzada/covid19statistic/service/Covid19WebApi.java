package com.zaurfarrukhzada.covid19statistic.service;

import com.zaurfarrukhzada.covid19statistic.model.Covid19Model;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Covid19WebApi {

    @Headers({
            "x-rapidapi-host:covid-193.p.rapidapi.com",
            "x-rapidapi-key:fb818f40c4msh9ed8e59abf0e867p11b3bfjsn0900d33b78ef"
    })
    @GET("statistics")
    Call<Covid19Model> getData();
}
