package com.example.kotlinapp_research

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET(value = "v2/list")
    fun getData(): Call<List<MyDataItem>>
}