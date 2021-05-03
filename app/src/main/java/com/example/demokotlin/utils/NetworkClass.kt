package com.example.demokotlin.utils

import com.example.demokotlin.network.Api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkClass {


    companion object {
        val url = "https://www.blueappsoftware.in/"
        fun getRetrofit(): Api? {
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(Api::class.java)
        }
    }
}