package com.codewithzaeem.core.network

sealed class Resource<T> {
    class Loading<T> : Resource<T>()
    data class Success<T>(val data: T) : Resource<T>()
    data class Error<T>(val e: Throwable) : Resource<T>()
}