package com.example.pokemonlisting.pokemonapi.model;
import com.google.gson.annotations.SerializedName;

public class Results {

    private String superName;
    public  Results(){
     super();
    }

    public Results(String name) {
        this.superName = name;
    }

    public String getName() {
        return superName;
    }
}
