package com.example.demokotlin.dagger
import dagger.Component
import revo.adnan.com.learnkotln.MainActivity
import revo.adnan.com.learnkotln.RetrofitActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [ProviderModule::class])
interface AppComponent {
    fun inject(activity: MainActivity?)
    fun inject(activity: RetrofitActivity?)
}