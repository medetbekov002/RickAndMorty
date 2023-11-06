package com.london.domain.usecases

import com.london.domain.extensions.Resource
import com.london.domain.model.RickAndMortyModel
import com.london.domain.model.toDomain
import com.london.domain.repositories.RickAndMortyRepository
//import com.london.rickandmorty.presentation.extensions.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RickAndMortyUseCase @Inject constructor(private val repository: RickAndMortyRepository) {
    suspend operator fun invoke(): Flow<Resource<List<RickAndMortyModel>>> = flow {
        try {
            emit(Resource.Loading())
            val data = repository.getCharacters().results.map { it.toDomain() }
            emit(Resource.Success(data))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "no internet connection"))
        } catch (e: IOException) {
            emit(Resource.Error("Error"))
        }
    }
}