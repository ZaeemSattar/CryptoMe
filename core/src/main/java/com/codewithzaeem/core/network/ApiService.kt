package com.codewithzaeem.core.network

import com.codewithzaeem.core.entity.AssetResponse
import retrofit2.http.GET

interface ApiService {

    @GET("assets")
    suspend fun getAssets(): AssetResponse
}