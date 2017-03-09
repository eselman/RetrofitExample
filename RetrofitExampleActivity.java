package com.android.training.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.training.retrofitexample.entities.Pokemon;
import com.android.training.retrofitexample.helpers.RetrofitHelper;
import com.android.training.retrofitexample.rest.providers.PokemonRestProvider;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitExampleActivity extends AppCompatActivity {
    private TextView pokemonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_example);

        pokemonText = (TextView) findViewById(R.id.pokemonText);

        RetrofitHelper retrofitHelper = new RetrofitHelper(this);
        PokemonRestProvider pokemonRestProvider = retrofitHelper.createProvider(PokemonRestProvider.class);
        Call<Pokemon> call = pokemonRestProvider.getPokemon();
        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                Pokemon pokemon = response.body();
                pokemonText.setText(pokemon.getName() + " - " + pokemon.getWeight() );
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                Toast.makeText(RetrofitExampleActivity.this, "Fallo la llamada al service: "  + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
