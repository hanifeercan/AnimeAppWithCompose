package com.hercan.animeappwithcompose.core.data.repo

import androidx.paging.PagingData
import com.hercan.animeappwithcompose.core.data.model.Anime
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun getAnimeList(): Flow<PagingData<Anime>>
}