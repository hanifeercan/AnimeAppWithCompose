package com.hercan.animeappwithcompose.core.network.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.hercan.animeappwithcompose.core.data.model.Anime
import com.hercan.animeappwithcompose.core.data.repo.toAnimeList

class PagingSource(
    private val source: RestDataSource
) : PagingSource<Int, Anime>() {

    override fun getRefreshKey(state: PagingState<Int, Anime>): Int? {
        return state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(it)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Anime> {

        return try {
            val page = params.key ?: 1
            val response = source.getAnimeList(page)
            val animeList = response.toAnimeList()
            val hasNext = response.body()?.pagination?.hasNextPage

            LoadResult.Page(
                data = animeList,
                prevKey = if (page == 1) null else page - 1,
                nextKey = if (hasNext == true) page + 1 else null
            )

        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}