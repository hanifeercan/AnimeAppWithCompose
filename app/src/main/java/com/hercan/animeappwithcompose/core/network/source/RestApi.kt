package com.hercan.animeappwithcompose.core.network.source

import com.hercan.animeappwithcompose.core.network.dto.AnimeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApi {

    @GET("anime")
    suspend fun getAnimeList(@Query("page") page: Int): Response<AnimeResponse>
}