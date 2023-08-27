package com.codewithzaeem.domain.repository

import com.codewithzaeem.core.entity.Asset
import com.codewithzaeem.core.network.Resource
import kotlinx.coroutines.flow.Flow

interface IAssetsRepository  {

    fun getAssets(): Flow<Resource<List<Asset>>>
}