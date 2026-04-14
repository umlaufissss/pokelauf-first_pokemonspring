package com.pokelauf.first_pokemonspring_api.configuration;

import com.pokelauf.first_pokemonspring_api.domain.Pokemon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PokemonConfiguration
{
    @Bean
    Pokemon p()
    {
    var p = new Pokemon(570, "Zorua", "Dark", "The Best Pokemon!");

    return p;
    }

    @Bean
    String pokedexEntry()
    {
        return p().getPokedexEntry();
    }
}
