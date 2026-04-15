package com.pokelauf.first_pokemonspring_api.configuration;

import com.pokelauf.first_pokemonspring_api.domain.Pokemon;
import com.pokelauf.first_pokemonspring_api.domain.Trainer;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.function.Supplier;

@Configuration
@ComponentScan(basePackages = "main")
public class PokemonConfiguration
{
    @Primary
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

    @Bean
    public Pokemon pokemon()
    {
        return new Pokemon(570, "Zorua", "Dark", "The Best Pokemon!");
    }

    @Bean
    public Trainer trainer(Pokemon pokemon)
    {
        Trainer trainer = new Trainer();
        trainer.setName("Isadora");
        trainer.setPokemon(pokemon);

        return trainer;
    }
}
