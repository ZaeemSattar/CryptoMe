package com.codewithzaeem.data.repository

import com.codewithzaeem.core.entity.Asset
import com.codewithzaeem.core.network.ApiService
import com.codewithzaeem.core.network.Resource
import com.codewithzaeem.domain.repository.IAssetsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class AssetRepository @Inject constructor(private val apiService: ApiService) : IAssetsRepository {


    override fun getAssets() = flow<Resource<List<Asset>>> {
        emit(
            Resource.Success(
                apiService.getAssets().data
            )
        )
    }.catch {
        emit(Resource.Error(it))
    }.flowOn(Dispatchers.IO)

}