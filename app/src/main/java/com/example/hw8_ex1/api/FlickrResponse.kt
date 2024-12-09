package com.example.hw8_ex1.api

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class FlickrResponse(
    val photos: PhotoResponse
)