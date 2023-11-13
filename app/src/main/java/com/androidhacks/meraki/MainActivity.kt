package com.androidhacks.meraki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView= findViewById<TextView>(R.id.textView)
        CoroutineScope(Dispatchers.IO).launch {
            val apiResult = APIClient().getApiService().getPathways()
            println(apiResult)
//            GlobalScope.launch {
//                textView.setText(apiResult.toString())
//            }
            val result = apiResult.pathways
//            apiResult.forEach {
//                println(it)
//            }
        }
    }

}