package com.pandorina.newsappwithnavigation.data.model

data class News(
    val id: Int,
    val image: String,
    val publisher: String,
    val publisher_id: Int,
    val time: String,
    val title: String,
    val article: String
)
