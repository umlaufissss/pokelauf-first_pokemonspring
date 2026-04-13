package com.pokelauf.first_pokemonspring_api.controller;

import com.pokelauf.first_pokemonspring_api.domain.Pokemon;
import com.pokelauf.first_pokemonspring_api.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokemon-test")
public class PokemonController
{

    @Autowired
    private PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService)
    {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public String pokemonTest()
    {
        return pokemonService.pokemonWorld("I choose you!");
    }

    @PostMapping("/{id}")
    public String pokemonTestPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter,@RequestBody Pokemon body)
    {
        return "Hello, new Pokemon! " + body.getName();
    }
}
