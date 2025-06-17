package com.hercan.animeappwithcompose.core.network.dto

import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("jpg") val jpg: Jpg?, @SerializedName("webp") val webp: Webp?
) {
    data class Jpg(
        @SerializedName("image_url") val imageUrl: String?,
        @SerializedName("large_image_url") val largeImageUrl: String?,
        @SerializedName("small_image_url") val smallImageUrl: String?
    )

    data class Webp(
        @SerializedName("image_url") val imageUrl: String?,
        @SerializedName("large_image_url") val largeImageUrl: String?,
        @SerializedName("small_image_url") val smallImageUrl: String?
    )
}