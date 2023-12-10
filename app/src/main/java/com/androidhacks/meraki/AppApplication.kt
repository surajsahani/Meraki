package com.androidhacks.meraki

import android.app.Application
import com.androidhacks.meraki.network.ApiServices
import com.androidhacks.meraki.network.RetrofitInstance

class AppApplication : Application() {

        lateinit var repo: MainRepository

        override fun onCreate() {
            super.onCreate()

            val apiService = RetrofitInstance.getInstance().create(ApiServices::class.java)

            //val database = AppDatabase.getDatabase(applicationContext)

            repo = MainRepository(apiService)
        }
}