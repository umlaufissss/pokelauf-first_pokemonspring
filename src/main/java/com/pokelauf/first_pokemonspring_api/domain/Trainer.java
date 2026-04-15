package com.pokelauf.first_pokemonspring_api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Trainer
{
    private String name;
    private Pokemon pokemon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
