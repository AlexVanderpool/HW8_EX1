package com.example.hw8_ex1

import com.example.hw8_ex1.api.FlickrApi
import com.example.hw8_ex1.api.GalleryItem
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.Field
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import kotlin.random.Random

class PhotoRepository() {

    private val flickrApi: FlickrApi


    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.flickr.com/")
            //.addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        flickrApi = retrofit.create()
    }




    //suspend fun fetchContents() = flickrApi.fetchContents()
    //suspend fun fetchPhotos() = flickrApi.fetchPhotos()
    suspend fun fetchPhotos(date: String): List<GalleryItem> =
        flickrApi.fetchPhotos(date = date).photos.galleryItems
    // flickrApi.fetchPhotos(date).photos.galleryItems


}