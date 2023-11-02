package com.london.rickandmorty.presentation.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.london.rickandmorty.domain.usecases.RickAndMortyUseCase
import com.london.rickandmorty.extensions.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RickAndMortyViewModel @Inject constructor(private val useCase: RickAndMortyUseCase): ViewModel() {
    private val _state = MutableStateFlow(RickAndMortyStates())
    val state: MutableStateFlow<RickAndMortyStates> = _state

    init {
        getItems()
    }

    private fun getItems() = viewModelScope.launch(Dispatchers.IO) {
        useCase().collect{
            when(it) {
                is Resource.Success-> _state.value = RickAndMortyStates(success = it.data ?: emptyList())
                is Resource.Loading-> _state.value = RickAndMortyStates(load = true)
                is Resource.Error-> _state.value = RickAndMortyStates(fail = it.message ?: "error")
            }
        }
    }
}