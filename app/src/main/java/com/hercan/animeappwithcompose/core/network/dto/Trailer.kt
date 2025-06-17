package com.hercan.animeappwithcompose.core.network.dto

import com.google.gson.annotations.SerializedName

data class Trailer(
    @SerializedName("embed_url") val embedUrl: String?,
    @SerializedName("images") val images: Images?,
    @SerializedName("url") val url: String?,
    @SerializedName("youtube_id") val youtubeId: String?
) {
    data class Images(
        @SerializedName("image_url") val imageUrl: String?,
        @SerializedName("large_image_url") val largeImageUrl: String?,
        @SerializedName("maximum_image_url") val maximumImageUrl: String?,
        @SerializedName("medium_image_url") val mediumImageUrl: String?,
        @SerializedName("small_image_url") val smallImageUrl: String?
    )
}