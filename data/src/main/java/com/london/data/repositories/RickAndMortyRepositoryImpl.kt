package com.london.data.repositories

import com.london.data.apiservice.RickAndMortyApiService
import com.london.data.dtos.Characters
import com.london.domain.repositories.RickAndMortyRepository
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(private val apiService: RickAndMortyApiService):
    RickAndMortyRepository {
    override suspend fun getCharacters(): Characters = apiService.getCharacters()
}