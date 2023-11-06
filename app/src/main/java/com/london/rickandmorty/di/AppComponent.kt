package com.london.rickandmorty.di

import com.london.rickandmorty.presentation.extensions.App
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, DataModule::class, DomainModule::class])
interface AppComponent {
    fun inject(app: App)
}