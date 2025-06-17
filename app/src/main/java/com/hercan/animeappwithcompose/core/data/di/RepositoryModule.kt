package com.hercan.animeappwithcompose.core.data.di

import com.hercan.animeappwithcompose.core.data.repo.AnimeRepository
import com.hercan.animeappwithcompose.core.data.repo.AnimeRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindAnimeRepository(bookRepositoryImpl: AnimeRepositoryImpl): AnimeRepository
}