package com.london.domain.repositories


interface RickAndMortyRepository {
    suspend fun getCharacters(): Characters
}