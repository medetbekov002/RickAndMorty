package com.london.domain.extensions

import com.london.rickandmorty.domain.extensions.NetworkError
import kotlinx.coroutines.flow.Flow

internal typealias RemoteWrapper<T> = Flow<Either<NetworkError, T>>