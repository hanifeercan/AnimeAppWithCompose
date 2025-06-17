package com.hercan.animeappwithcompose.core.network.source

import com.hercan.animeappwithcompose.core.network.dto.AnimeResponse
import retrofit2.Response

interface RestDataSource {
    suspend fun getAnimeList(page: Int): Response<AnimeResponse>
}