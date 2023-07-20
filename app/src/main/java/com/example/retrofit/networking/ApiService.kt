package com.example.retrofit.networking

import android.graphics.pdf.PdfDocument.Page
import android.security.identity.AccessControlProfileId
import android.service.autofill.UserData
import com.example.retrofit.model.MarvelData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("demos/marvel/")

    fun getMarvels(): Call<List<MarvelData>>

    @GET("/api/users")
    fun getUsers(@Query("page") page: Int): Call<UserData>

    @GET("/api/users/{id}")
    fun getSingleUser(@Path("id") id: Int): Call<SingleUser>
}