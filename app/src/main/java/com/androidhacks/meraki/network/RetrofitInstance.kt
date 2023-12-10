package com.androidhacks.meraki.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val base_url = "https://merd-api.merakilearn.org/"


    fun getInstance() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getApiService() : ApiServices {
        return getInstance().create(ApiServices::class.java)
    }
}