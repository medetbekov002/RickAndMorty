package com.london.rickandmorty.data.apiservice

import com.london.rickandmorty.data.dtos.Characters
import com.london.rickandmorty.extensions.Constants
import retrofit2.http.GET

interface RickAndMortyApiService {
    @GET(Constants.END_POINT)
    suspend fun getCharacters(): Characters
}