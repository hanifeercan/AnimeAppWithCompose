package com.hercan.animeappwithcompose.core.network.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.hercan.animeappwithcompose.core.network.source.RestApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private const val BASE_URL = "https://api.jikan.moe/v4/"

    @Singleton
    @Provides
    fun getRetrofit(gson: Gson): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson)).build()
    }

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    @Singleton
    @Provides
    fun getRickAndMortyApi(retrofit: Retrofit): RestApi {
        return retrofit.create(RestApi::class.java)
    }
}