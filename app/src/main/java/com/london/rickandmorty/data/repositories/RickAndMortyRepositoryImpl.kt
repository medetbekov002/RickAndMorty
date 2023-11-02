package com.london.rickandmorty.data.repositories

import com.london.rickandmorty.domain.repositories.RickAndMortyRepository
import com.london.rickandmorty.data.apiservice.RickAndMortyApiService
import com.london.rickandmorty.data.dtos.Characters
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(private val apiService: RickAndMortyApiService):
    RickAndMortyRepository {
    override suspend fun getCharacters(): Characters = apiService.getCharacters()
}