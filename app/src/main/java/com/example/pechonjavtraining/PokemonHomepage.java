package com.example.pechonjavtraining;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PokemonHomepage extends AppCompatActivity {
    Button logout;

    private RecyclerView recyclerView;
    private PokemonAdapter adapter;
    private List<Pokemon> pokemonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pokemon_homepage);

        recyclerView = findViewById(R.id.recyclerListView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        logout = findViewById(R.id.btnLogout);

        // Initialize data
        pokemonList = new ArrayList<>();
        pokemonList.add(new Pokemon("Bulbasaur", R.drawable.bulbasaur, "Bulbasaur is an Grass-Poison Type Pokémon.")); // Ensure these images are in res/drawable
        pokemonList.add(new Pokemon("Charmander", R.drawable.charmander,"Charmander is an Fire Type Pokémon."));
        pokemonList.add(new Pokemon("Squirtle", R.drawable.squirtle,"Squirtle is an Water Type Pokémon."));

        // Set adapter
        adapter = new PokemonAdapter(this, pokemonList);
        recyclerView.setAdapter(adapter);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(getApplicationContext(), PokedexLogin.class);
                startActivity(x);
            }
        });

    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(), PokemonHomepage.class);
        startActivity(i);
    }
}
