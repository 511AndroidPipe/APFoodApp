package com.pipeanayap.foodapp.models

data class Categoria(
    val nombre : String,
    val imagen : String
)

val categoryList = listOf(
    Categoria(
        nombre = "FastFood",
        imagen = "https://static.vecteezy.com/system/resources/thumbnails/048/034/697/small/fast-food-board-with-hamburger-french-fries-isolated-on-transparent-background-free-png.png"
    ),
    Categoria(
        nombre = "Chinese",
        imagen = "https://www.pngplay.com/wp-content/uploads/15/Chinese-Food-Box-PNG-HD-Quality.png"
    ),
    Categoria(
        nombre = "Italian",
        imagen = "https://cdn4.iconfinder.com/data/icons/food-and-drink-1-2/64/pizza-food-italian-meal-512.png"
    ),
    Categoria(
        nombre = "Mexican",
        imagen = "https://png.pngtree.com/png-clipart/20220615/original/pngtree-mexican-food-tacos-vector-image-png-image_8043031.png"
    ),
    Categoria(
        nombre = "Argentinian",
        imagen = "https://images.vexels.com/media/users/3/298553/isolated/preview/fcbdc0164d098cf503912f651f2830e6-icono-de-empanada-de-comida-argentina.png"
    )

)