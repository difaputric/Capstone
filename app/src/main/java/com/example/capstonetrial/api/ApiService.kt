package com.example.capstonetrial.api

import com.example.capstonetrial.response.EquipmentResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*

interface ApiService {

    @GET("stories")
    suspend fun getStories(@Header("Authorization") token: String): EquipmentResponse

}