package com.example.pokemonlisting.pokemonapi.controller;

import com.example.pokemonlisting.pokemonapi.service.implementation.PokemonApi;
import com.example.pokemonlisting.pokemonapi.service.model.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "PokemonApiController", description = "REST Apis related to Pokemon Results Entity!")
@RestController
public class PokemonApiController {
    PokemonApi pokemonApi = new PokemonApi();
    @ApiOperation(value = "Get list of Pokemons  in the System ", response = Iterable.class, tags = "getSuperHeroes")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })
    @RequestMapping(value = "/getSuperHeroes")
    public List<Results> getSuperHeroes() {
        return pokemonApi.getMyHeroList();
    }


}
