package com.london.rickandmorty.di

import com.london.domain.repositories.RickAndMortyRepository
import com.london.domain.usecases.RickAndMortyUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRickAndMortyUseCase(repository: RickAndMortyRepository): RickAndMortyUseCase {
        return RickAndMortyUseCase(repository = repository)
    }
}