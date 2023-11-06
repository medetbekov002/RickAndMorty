package com.london.rickandmorty.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.london.rickandmorty.presentation.ui.viewmodel.RickAndMortyViewModel

@Composable
fun MainScreen(viewModel: RickAndMortyViewModel = viewmodel()) {
    val state = viewModel.state.collectAsState()

    Box(modifier = Modifier.fillMaxSize()) {
        if (state.value.load) {
            CircularProgressIndicator(Modifier.align(Alignment.Center))
        }

        state.value.success?.let { list ->
            LazyColumn(Modifier.fillMaxSize()) {
                items(list) { item ->
                    Text(
                        text = item,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

        state.value.fail?.let { message ->
            Toast.makeText(LocalContext.current, message, Toast.LENGTH_SHORT).show()
        }
    }
}