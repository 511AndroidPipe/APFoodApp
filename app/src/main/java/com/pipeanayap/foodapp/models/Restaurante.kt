package com.pipeanayap.foodapp.models

data class Restaurante(
    val nombre : String,
    val imagen : String
)

val restaurantList = listOf(
    Restaurante(
        nombre = "Burger King",
        imagen = "https://static.vecteezy.com/system/resources/thumbnails/019/909/468/small/burger-king-transparent-burger-king-free-free-png.png"
    ),
    Restaurante(
        nombre = "McDonald´s",
        imagen = "https://1000marcas.net/wp-content/uploads/2019/11/McDonalds-logo.png"
    ),
    Restaurante(
        nombre = "KFC",
        imagen = "https://cdn.freelogovectors.net/wp-content/uploads/2023/01/kfclogo-freelogovectors.net_.png"
    )
)