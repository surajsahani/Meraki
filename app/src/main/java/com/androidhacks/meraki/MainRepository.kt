package com.androidhacks.meraki

import com.androidhacks.meraki.models.Pathway
import com.androidhacks.meraki.models.PathwayDTO
import com.androidhacks.meraki.network.ApiServices

class MainRepository(
    private val apiClient: ApiServices,
) {
    suspend fun getCoursesByPathwayId(pathwayId: Int): PathwayDTO {
        return apiClient.getPathways(pathwayId)
    }
}