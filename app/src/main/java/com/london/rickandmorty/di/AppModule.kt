package com.london.rickandmorty.di

import android.app.Application
import android.content.Context
import com.london.rickandmorty.data.apiservice.RickAndMortyApiService
import com.london.rickandmorty.data.repositories.RickAndMortyRepositoryImpl
import com.london.rickandmorty.domain.repositories.RickAndMortyRepository
import com.london.rickandmorty.presentation.extensions.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule(private val application: Application, val context: Context) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context = application

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
        return RickAndMortyRepositoryImpl(apiService)
    }
}