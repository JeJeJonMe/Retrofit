package com.example.retrofit.networking

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://www.simplifiedcoding.net/"
    private const val BASE_URL2 = "https://reqres.in"


    fun getRetrofit(): Retrofit{
        val httpLoggingInterceptor = HttpLoggingInterceptor()



        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}