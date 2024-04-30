package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject lateinit var databaseHelper: DatabaseHelper
    @Inject lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val appComponent = (application as App).appComponent

       // databaseHelper = appComponent.getDatabaseHelper()
       // networkUtils = appComponent.getNetworkUtils()
        (application as App).appComponent.injectToMainActivity(this)

        Log.d("RRR",databaseHelper.toString())
        Log.d("RRR",networkUtils.toString())
    }
}