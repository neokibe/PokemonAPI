package com.example.pokemonlisting.pokemonapi.service;

import com.example.pokemonlisting.pokemonapi.service.interafce.IPokemonApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;
    private IPokemonApi myPokemonApi;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(IPokemonApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myPokemonApi = retrofit.create(IPokemonApi.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public IPokemonApi getMyPokemonApi() {
        return myPokemonApi;
    }
}
