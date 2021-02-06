package com.example.newsapplication.Common

import com.example.newsapplication.Interface.NewsService
import com.example.newsapplication.Remote.RetrofitClient
import java.lang.StringBuilder
import javax.xml.transform.Source

object Common {
    val BASE_URL = "https://newsapi.org/"
    val API_KEY = "88730f648c10409bbb5193d5e89a6726"

    val newsService: NewsService
    get() = RetrofitClient.getClient(BASE_URL).create(NewsService::class.java)

    fun getNewsAPI(source: String): String {
        val apiUrl = StringBuilder("https://newsapi.org/v2/top-headlines?sources=")
            .append(source)
            .append("&apiKey=")
            .append(API_KEY)
            .toString()

        return apiUrl
    }
}