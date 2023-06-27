package com.ramaa.finalprojectmypokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.ramaa.finalprojectmypokedex.data.remote.responses.Pokemon
import com.ramaa.finalprojectmypokedex.repository.PokemonRepository
import com.ramaa.finalprojectmypokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}