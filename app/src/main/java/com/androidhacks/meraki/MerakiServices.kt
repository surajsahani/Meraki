package com.androidhacks.meraki

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.io.Serializable

interface MerakiServices {

    @GET("pathways")
    suspend fun getPathways(): PathwayContainer
}

class APIClient {
    val retrofit =
        Retrofit.Builder()
            .baseUrl("https://merd-api.merakilearn.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun getApiService() = retrofit.create(MerakiServices::class.java)

}

//@Json(name = "pathways")
//data class Pathway(
//    val id: Int,
//    val name: String,
//) : Serializable