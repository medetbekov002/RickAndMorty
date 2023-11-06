package com.london.data.apiservice

import com.london.data.dtos.Characters
import com.london.rickandmorty.presentation.extensions.Constants
import retrofit2.http.GET

interface RickAndMortyApiService {
    @GET(Constants.END_POINT)
    suspend fun getCharacters(): Characters
}