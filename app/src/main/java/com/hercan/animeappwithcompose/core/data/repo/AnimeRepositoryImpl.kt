package com.hercan.animeappwithcompose.core.data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.hercan.animeappwithcompose.core.data.model.Anime
import com.hercan.animeappwithcompose.core.network.source.PagingSource
import com.hercan.animeappwithcompose.core.network.source.RestDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val restDataSource: RestDataSource
) : AnimeRepository {

    override fun getAnimeList(): Flow<PagingData<Anime>> {
        val pagingSource = PagingSource(restDataSource)
        return Pager(
            config = PagingConfig(pageSize = 20), pagingSourceFactory = { pagingSource }).flow
    }
}