package com.codewithzaeem.data.usecase

import com.codewithzaeem.core.entity.Asset
import com.codewithzaeem.core.network.Resource
import com.codewithzaeem.domain.repository.IAssetsRepository
import com.codewithzaeem.domain.usecase.IGetAssetsUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAssetsUseCase @Inject constructor(private val assetRepository: IAssetsRepository) :
    IGetAssetsUseCase {

    override operator fun invoke(): Flow<Resource<List<Asset>>> {

        return assetRepository.getAssets()
    }

}