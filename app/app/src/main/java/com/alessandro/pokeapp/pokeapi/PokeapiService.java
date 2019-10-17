package com.alessandro.pokeapp.pokeapi;

import com.alessandro.pokeapp.models.PokemonRespuesta;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeapiService {
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit")int limit, @Query("offset")int offset);
}
