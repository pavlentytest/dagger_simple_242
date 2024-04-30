package com.example.myapplication

import com.example.myapplication.module.NetworkModule
import com.example.myapplication.module.StorageModule
import dagger.Component

@Component(modules = [StorageModule::class,NetworkModule::class])
interface AppComponent {
    fun getDatabaseHelper(): DatabaseHelper
    fun getNetworkUtils() : NetworkUtils

    fun injectToMainActivity(mainActivity: MainActivity)
}