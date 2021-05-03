package com.example.demokotlin

import dagger.Module
import dagger.Provides

@Module
class ProviderModule {

    fun ProviderModule() {

    }

    @Provides
    fun provideEggs(): String? {
        return "Eggs"
    }

}