package com.zaurfarrukhzada.covid19statistic.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zaurfarrukhzada.covid19statistic.R;
import com.zaurfarrukhzada.covid19statistic.adapter.MyRecycleViewAdapter;
import com.zaurfarrukhzada.covid19statistic.model.Covid19Model;
import com.zaurfarrukhzada.covid19statistic.model.Response;
import com.zaurfarrukhzada.covid19statistic.service.Covid19WebApi;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<Response> responses = new ArrayList<>();
    private String BASE_URL = "https://covid-193.p.rapidapi.com/";
    RecyclerView recyclerView;
    MyRecycleViewAdapter myRecycleViewAdapter;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       recyclerView = findViewById(R.id.recycleViewCovid);
       Retrofit.Builder builder = new Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addConverterFactory(GsonConverterFactory.create());//this is convert json

       Retrofit retrofit = builder.build();

       Covid19WebApi covid19WebApi = retrofit.create(Covid19WebApi.class);
       Call<Covid19Model> call = covid19WebApi.getData();//this is call api interfacee method

       call.enqueue(new Callback<Covid19Model>() {
           @Override
           public void onResponse(Call<Covid19Model> call, retrofit2.Response<Covid19Model> response) {
               if(response != null){
                   responses = (ArrayList<Response>) response.body().getResponse();
                   LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                   recyclerView.setLayoutManager(layoutManager);
                   myRecycleViewAdapter = new MyRecycleViewAdapter(responses);
                   recyclerView.setAdapter(myRecycleViewAdapter);
               }else{
                   Toast.makeText(MainActivity.this,response.message(),Toast.LENGTH_LONG).show();
               }

           }
           @Override
           public void onFailure(Call<Covid19Model> call, Throwable t) {
             Toast.makeText(MainActivity.this,t.getLocalizedMessage(),Toast.LENGTH_LONG).show();//this is toast message failure
           }
       });

   }









}