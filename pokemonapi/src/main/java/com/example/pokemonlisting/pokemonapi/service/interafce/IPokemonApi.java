package com.example.pokemonlisting.pokemonapi.service.interafce;

import com.example.pokemonlisting.pokemonapi.service.model.Results;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface IPokemonApi {
    String BASE_URL = "https://pokeapi.co";
    @GET("Pokemon")
    Call<List<Results>> getSuperHeroes();
}
