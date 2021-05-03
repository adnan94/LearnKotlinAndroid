package com.example.demokotlin
import dagger.Component
import revo.adnan.com.learnkotln.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [ProviderModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity?)
}