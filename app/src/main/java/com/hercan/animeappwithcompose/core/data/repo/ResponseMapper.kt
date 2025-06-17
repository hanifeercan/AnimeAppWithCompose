package com.hercan.animeappwithcompose.core.data.repo

import com.hercan.animeappwithcompose.core.data.model.Anime
import com.hercan.animeappwithcompose.core.network.dto.AnimeResponse
import retrofit2.Response

fun Response<AnimeResponse>.toAnimeList(): List<Anime> {
    return body()!!.data!!.map { anime ->

        val themes = anime?.themes?.map {
            if(!it?.name.isNullOrEmpty()) {
                it.name
            }else{
                ""
            }
        } ?: emptyList()

        val imageUrl = anime?.images?.jpg?.imageUrl ?: ""

        Anime(
            anime?.duration ?: "",
            anime?.episodes ?: -1,
            imageUrl,
            anime?.malId ?: -1,
            anime?.score ?: -1.0,
            anime?.scoredBy ?: -1,
            anime?.source ?: "",
            anime?.status ?: "",
            anime?.synopsis ?: "",
            themes,
            anime?.title ?: "",
            anime?.trailer,
            anime?.type ?: "",
            anime?.url ?: "",
            anime?.year ?: -1
        )
    }
}