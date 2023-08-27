package com.codewithzaeem.data.di

import com.codewithzaeem.data.usecase.GetAssetsUseCase
import com.codewithzaeem.domain.repository.IAssetsRepository
import com.codewithzaeem.domain.usecase.IGetAssetsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {


    @Provides
    fun provideGetAssetsUseCase(assetRepository: IAssetsRepository): IGetAssetsUseCase {

        return GetAssetsUseCase(assetRepository)
    }

}