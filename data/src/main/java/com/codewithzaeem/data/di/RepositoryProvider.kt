package com.codewithzaeem.data.di

import com.codewithzaeem.core.network.ApiService
import com.codewithzaeem.data.repository.AssetRepository
import com.codewithzaeem.domain.repository.IAssetsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryProvider {

    @Provides
    fun provideAssetRepository(apiService: ApiService): IAssetsRepository {
        return AssetRepository(apiService)
    }
}