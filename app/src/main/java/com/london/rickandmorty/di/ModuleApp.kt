package com.london.rickandmorty.di

import com.london.data.apiservice.RickAndMortyApiService
import com.london.data.repositories.RickAndMortyRepositoryImpl
import com.london.domain.repositories.RickAndMortyRepository
import com.london.rickandmorty.presentation.extensions.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent:: class)
object ModuleApp {

    @Singleton
    @Provides
    fun providesRetrofit() = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RickAndMortyApiService::class.java)

    @Singleton
    @Provides
    fun providesRepository(apiService: RickAndMortyApiService): RickAndMortyRepository = RickAndMortyRepositoryImpl(apiService)
}