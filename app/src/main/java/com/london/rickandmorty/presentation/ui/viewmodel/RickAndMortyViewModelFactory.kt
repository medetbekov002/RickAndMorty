package com.london.rickandmorty.presentation.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.london.rickandmorty.domain.usecases.RickAndMortyUseCase
import javax.inject.Inject
import javax.inject.Provider

class RickAndMortyViewModelFactory @Inject constructor(
    private val useCase: Provider<RickAndMortyUseCase>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RickAndMortyViewModel::class.java)) {
            return RickAndMortyViewModel(useCase.get()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}