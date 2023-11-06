package com.london.rickandmorty.presentation.extensions

import android.app.Application
import com.london.rickandmorty.di.AppComponent
import com.london.rickandmorty.di.AppModule
import dagger.hilt.android.HiltAndroidApp

class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }
}