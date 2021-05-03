package com.example.demokotlin.utils

import android.app.Application
import com.example.demokotlin.dagger.AppComponent
import com.example.demokotlin.dagger.DaggerAppComponent
import com.example.demokotlin.dagger.ProviderModule

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