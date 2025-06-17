package com.hercan.animeappwithcompose.core.network.dto

import com.google.gson.annotations.SerializedName

data class AnimeResponse(
    @SerializedName("data") val `data`: List<Data?>?,
    @SerializedName("pagination") val pagination: Pagination?
)