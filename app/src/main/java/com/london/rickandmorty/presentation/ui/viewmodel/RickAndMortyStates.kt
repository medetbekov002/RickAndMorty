package com.london.rickandmorty.presentation.ui.viewmodel

import com.london.rickandmorty.domain.model.RickAndMortyModel

data class RickAndMortyStates (
    val load: Boolean = false,
    val success: List<RickAndMortyModel> = emptyList(),
    val fail: String = ""
)