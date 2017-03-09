package com.android.training.retrofitexample.rest.providers;

import com.android.training.retrofitexample.entities.Pokemon;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by eselman on 08/03/2017.
 */

public interface PokemonRestProvider {

    @GET("pokemon/1")
    Call<Pokemon> getPokemon();
}
