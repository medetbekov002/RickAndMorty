package com.london.rickandmorty.domain.repositories

import com.london.rickandmorty.data.dtos.Characters


interface RickAndMortyRepository {
    suspend fun getCharacters(): Characters
}