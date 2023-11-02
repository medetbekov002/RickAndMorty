package com.london.rickandmorty.di

import com.london.rickandmorty.data.apiservice.RickAndMortyApiService
import com.london.rickandmorty.data.repositories.RickAndMortyRepositoryImpl
import com.london.rickandmorty.domain.repositories.RickAndMortyRepository
import com.london.rickandmorty.domain.usecases.RickAndMortyUseCase
import com.london.rickandmorty.extensions.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideRickAndMortyApiService(retrofit: Retrofit): RickAndMortyApiService {
        return retrofit.create(RickAndMortyApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideRickAndMortyRepository(apiService: RickAndMortyApiService): RickAndMortyRepository {
        return RickAndMortyRepositoryImpl(apiService = apiService)
    }
}