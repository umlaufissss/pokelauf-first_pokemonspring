package com.pokelauf.first_pokemonspring_api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Pokemon
{
    private int id;
    private String name;
    private String type;
    private String pokedexEntry;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getPokedexEntry()
    {
        return pokedexEntry;
    }

    public void setPokedexEntry(String pokedexEntry)
    {
        this.pokedexEntry = pokedexEntry;
    }
}
