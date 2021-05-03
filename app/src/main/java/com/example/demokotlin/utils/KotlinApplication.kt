package com.example.demokotlin

import android.app.Application

class KotlinApplication : Application() {

   lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
    initDagger()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.builder()
            .providerModule(ProviderModule())
            .build()
    }



    fun getApppComponent(): AppComponent {
        return appComponent;
    }
}