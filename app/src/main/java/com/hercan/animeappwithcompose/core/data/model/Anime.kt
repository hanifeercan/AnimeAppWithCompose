package com.hercan.animeappwithcompose.core.data.model

import com.hercan.animeappwithcompose.core.network.dto.Trailer

data class Anime(
    val duration: String,
    val episodes: Int,
    val imageUrl: String,
    val malId: Int,
    val score: Double,
    val scoredBy: Int,
    val source: String,
    val status: String,
    val synopsis: String,
    val themes: List<String>,
    val title: String,
    val trailer: Trailer?,
    val type: String,
    val url: String,
    val year: Int
)