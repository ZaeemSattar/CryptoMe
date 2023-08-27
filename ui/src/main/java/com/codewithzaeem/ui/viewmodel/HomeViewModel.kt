package com.codewithzaeem.ui.viewmodel


import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codewithzaeem.core.network.Resource
import com.codewithzaeem.domain.usecase.IGetAssetsUseCase
import com.codewithzaeem.ui.screen.home.HomeUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getUsersUseCase: IGetAssetsUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(HomeUI())
    val state: StateFlow<HomeUI> = _state.asStateFlow()

    init {
        getAssets()
    }

    private fun getAssets() {
        getUsersUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = HomeUI(isLoading = false, assets = result.data)
                }

                is Resource.Error -> {
                    _state.value = HomeUI(isLoading = false, error = result.e.localizedMessage)

                }

                is Resource.Loading -> {
                    _state.value = HomeUI(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}