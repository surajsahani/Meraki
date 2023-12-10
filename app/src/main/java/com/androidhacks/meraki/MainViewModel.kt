package com.androidhacks.meraki

import androidx.lifecycle.ViewModel

class MainViewModel(val repo: MainRepository)  : ViewModel() {



    suspend fun getCoursesByPathwayId(pathwayId: Int) {
        repo.getCoursesByPathwayId(pathwayId).let {
            println(it)
        }
    }
}