package com.hercan.animeappwithcompose.core.network.source

import com.hercan.animeappwithcompose.core.network.dto.AnimeResponse
import retrofit2.Response
import javax.inject.Inject

class RestDataSourceImpl @Inject constructor(private val restApi: RestApi) : RestDataSource {

    override suspend fun getAnimeList(page: Int): Response<AnimeResponse> {
        return restApi.getAnimeList(page)
    }
}