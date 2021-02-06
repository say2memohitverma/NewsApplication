package com.example.newsapplication.Interface

import com.example.newsapplication.Model.News
import com.example.newsapplication.Model.WebSite
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface NewsService {
    @get: GET("v2/sources?apiKey=88730f648c10409bbb5193d5e89a6726")
    val sources: Call<WebSite>

    @GET
    fun getNewsFromSource(@Url url: String): Call<News>
}