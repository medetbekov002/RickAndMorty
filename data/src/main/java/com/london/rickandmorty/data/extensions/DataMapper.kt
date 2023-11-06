package com.london.rickandmorty.data.extensions

interface DataMapper<T> {
    fun mapToDomain(): T
}