package com.london.data.extensions

interface DataMapper<T> {
    fun mapToDomain(): T
}