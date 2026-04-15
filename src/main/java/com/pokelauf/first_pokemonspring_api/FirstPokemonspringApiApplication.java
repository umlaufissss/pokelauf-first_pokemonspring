package com.pokelauf.first_pokemonspring_api;

import com.pokelauf.first_pokemonspring_api.configuration.PokemonConfiguration;
import com.pokelauf.first_pokemonspring_api.domain.Pokemon;
import com.pokelauf.first_pokemonspring_api.domain.Trainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication

public class FirstPokemonspringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstPokemonspringApiApplication.class, args);

		var context = new AnnotationConfigApplicationContext(PokemonConfiguration.class);

		Trainer trainer = context.getBean(Trainer.class);

		Pokemon pokemon = context.getBean(Pokemon.class);

		System.out.println("Trainer's name: " + trainer.getName());
		System.out.println("Pokemon's name: " + pokemon.getName());

		System.out.println("Trainer's pokemon: " + trainer.getPokemon());
	}

}
