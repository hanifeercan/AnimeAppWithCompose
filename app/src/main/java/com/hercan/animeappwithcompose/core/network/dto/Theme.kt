package com.hercan.animeappwithcompose.core.network.dto

import com.google.gson.annotations.SerializedName

data class Theme(
    @SerializedName("mal_id") val malId: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("type") val type: String?,
    @SerializedName("url") val url: String?
)