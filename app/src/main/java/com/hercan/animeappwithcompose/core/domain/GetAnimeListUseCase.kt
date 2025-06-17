package com.hercan.animeappwithcompose.core.domain

import androidx.paging.PagingData
import com.hercan.animeappwithcompose.core.data.model.Anime
import com.hercan.animeappwithcompose.core.data.repo.AnimeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAnimeListUseCase @Inject constructor(private val repository: AnimeRepository) {
    operator fun invoke(): Flow<PagingData<Anime>> {
        return repository.getAnimeList()
    }
}