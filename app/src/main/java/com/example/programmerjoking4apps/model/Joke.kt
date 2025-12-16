package com.example.programmerjoking4apps.model

data class Joke (
    val error : Boolean,
    val category : String,
    val type : String?,
    val setup : String ?= null,
    val delivery : String ?= null,
    val id : Long,
    val safe : Boolean,
    val lang : String,
    val joke: String? = null
)

data class Flags (
    val nsfw: Boolean,
    val religious: Boolean,
    val political: Boolean,
    val racist: Boolean,
    val sexist: Boolean,
    val explicit: Boolean
)
enum class Type {
    SINGLE,
    TWO_PARTS
}



