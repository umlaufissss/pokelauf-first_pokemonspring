package com.pokelauf.first_pokemonspring_api.services;


import org.springframework.stereotype.Service;

@Service
public class PokemonService
{
    public String pokemonWorld(String pokemon)
    {
        return "Pikachu? " + pokemon;
    }
}
