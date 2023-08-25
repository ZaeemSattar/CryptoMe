package com.codewithzaeem.core.network


import com.codewithzaeem.core.model.Post
import javax.inject.Inject

class ApiServiceImpl @Inject constructor(private val apiService: ApiService) {

    suspend fun getPost(): List<Post> = apiService.getPost()
}