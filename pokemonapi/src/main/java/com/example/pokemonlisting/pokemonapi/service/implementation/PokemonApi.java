package com.example.pokemonlisting.pokemonapi.service.implementation;

import com.example.pokemonlisting.pokemonapi.service.RetrofitClient;
import com.example.pokemonlisting.pokemonapi.service.model.Results;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class PokemonApi {
    private List<Results> myHeroList;
    public List<Results> getMyHeroList() {
        return myHeroList;
    }

    public void setMyHeroList(List<Results> myHeroList) {
        this.myHeroList = myHeroList;
    }
    public void getSuperHeroes() {
        Call<List<Results>> call = RetrofitClient.getInstance().getMyPokemonApi().getSuperHeroes();
        call.enqueue(new Callback<List<Results>>() {
            @Override
            public void onResponse(Call<List<Results>> call, Response<List<Results>> response) {
                myHeroList = response.body();
                String[] oneHeroes = new String[myHeroList.size()];
                for (int i = 0; i < myHeroList.size(); i++) {
                    oneHeroes[i] = myHeroList.get(i).getName();
                }
            }

            @Override
            public void onFailure(Call<List<Results>> call, Throwable t) {
            }
        });
    }
}
