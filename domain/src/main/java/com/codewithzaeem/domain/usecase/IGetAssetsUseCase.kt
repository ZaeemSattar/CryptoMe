package com.codewithzaeem.domain.usecase

import com.codewithzaeem.core.entity.Asset
import com.codewithzaeem.core.network.Resource
import kotlinx.coroutines.flow.Flow

interface IGetAssetsUseCase {

    operator fun invoke(): Flow<Resource<List<Asset>>>

}