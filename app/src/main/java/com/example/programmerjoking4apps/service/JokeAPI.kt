package com.example.programmerjoking4apps.service

import com.example.programmerjoking4apps.model.Joke
import retrofit2.http.GET
interface JokeAPI {


    @GET("atilsamancioglu/ProgrammingJokesJSON/refs/heads/main/jokes.json")
    suspend fun getJoke(): List<Joke>

}