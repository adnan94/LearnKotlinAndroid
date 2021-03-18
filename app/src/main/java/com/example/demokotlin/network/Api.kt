package com.example.demokotlin.network
import com.example.demokotlin.model.ModelClass
import com.example.demokotlin.model.PojoClass
import retrofit2.Call
import retrofit2.http.GET

interface Api {
        @get:GET("marvel")
        val heroes: Call<List<PojoClass?>?>?

        @get:GET("android/downloadcode/objectfile.json")
        val model: Call<ModelClass?>?

        companion object {
            const val BASE_URL = "https://simplifiedcoding.net/demos/"
        }
    }