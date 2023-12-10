package com.androidhacks.meraki.network

import com.androidhacks.meraki.models.PathwayDTO
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {
    @GET("pathways/{pathway_id}/courses")
    suspend fun getPathways(
        @Header("version-code") version: Int = 87,
        @Path("pathway_id") pathway_id: Int = 1,
        @Query("courseType") coursetype: String = "json",
    ): PathwayDTO
}