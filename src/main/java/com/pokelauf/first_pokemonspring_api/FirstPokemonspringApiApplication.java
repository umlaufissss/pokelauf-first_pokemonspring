package com.pokelauf.first_pokemonspring_api;

import com.pokelauf.first_pokemonspring_api.configuration.PokemonConfiguration;
import com.pokelauf.first_pokemonspring_api.domain.Pokemon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class FirstPokemonspringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstPokemonspringApiApplication.class, args);

		var context = new AnnotationConfigApplicationContext(PokemonConfiguration.class);

		Pokemon p = context.getBean(Pokemon.class);

		System.out.println(p.getName());

		String s = context.getBean(String.class);
		System.out.println(s);
	}

}
