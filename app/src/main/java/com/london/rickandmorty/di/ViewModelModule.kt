package com.london.rickandmorty.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.london.rickandmorty.presentation.ui.viewmodel.RickAndMortyViewModel
import com.london.rickandmorty.presentation.ui.viewmodel.RickAndMortyViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: RickAndMortyViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(RickAndMortyViewModel::class)
    abstract fun bindRickAndMortyViewModel(viewModel: RickAndMortyViewModel): ViewModel
}