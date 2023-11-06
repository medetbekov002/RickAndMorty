package com.london.domain.repositories

import com.london.domain.extensions.Characters


interface RickAndMortyRepository {
    suspend fun getCharacters(): Characters
}