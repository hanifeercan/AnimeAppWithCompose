package com.hercan.animeappwithcompose.core.network.dto

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("duration") val duration: String?,
    @SerializedName("episodes") val episodes: Int?,
    @SerializedName("images") val images: Images?,
    @SerializedName("mal_id") val malId: Int?,
    @SerializedName("score") val score: Double?,
    @SerializedName("scored_by") val scoredBy: Int?,
    @SerializedName("source") val source: String?,
    @SerializedName("status") val status: String?,
    @SerializedName("synopsis") val synopsis: String?,
    @SerializedName("themes") val themes: List<Theme?>?,
    @SerializedName("title") val title: String?,
    @SerializedName("trailer") val trailer: Trailer?,
    @SerializedName("type") val type: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("year") val year: Int?
)