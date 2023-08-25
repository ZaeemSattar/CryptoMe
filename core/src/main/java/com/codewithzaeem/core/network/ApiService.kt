package com.codewithzaeem.core.network

import com.codewithzaeem.core.model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPost():List<Post>
}