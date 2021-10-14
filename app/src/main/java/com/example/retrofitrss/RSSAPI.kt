package com.example.retrofitrss

import com.example.retrofitrss.model.RSS
import retrofit2.Call
import retrofit2.http.GET

interface RSSAPI {
    @get:GET("rss?topic=h&hl=en-US&gl=US&ceid=US:en")
    val feed: Call<RSS?>?

    companion object {
        const val BASE_URL = "https://news.google.com/"
    }
}
//https://www.reddit.com/r/cats/.rss
//https://news.google.com/rss?topic=h&hl=en-US&gl=US&ceid=US:en