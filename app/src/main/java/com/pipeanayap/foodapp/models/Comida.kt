package com.pipeanayap.foodapp.models

data class Comida(
    val nombre : String,
    val calificacion : Float,
    val precio : Float,
    val imagen : String
)

val foodList = listOf(
    Comida(
        nombre = "Whooper",
        calificacion = 4.5f,
        precio = 99.8f,
        imagen = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/ec545603-cf4e-48e0-936d-5376ea12fdc0/dh7s984-1f3733d3-0fba-49fc-a0a2-c6282e3d2246.png/v1/fill/w_400,h_268/burger_king_whopper_jr_with_cheese_png_2024_by_wcwjunkbox_dh7s984-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MjY4IiwicGF0aCI6IlwvZlwvZWM1NDU2MDMtY2Y0ZS00OGUwLTkzNmQtNTM3NmVhMTJmZGMwXC9kaDdzOTg0LTFmMzczM2QzLTBmYmEtNDlmYy1hMGEyLWM2MjgyZTNkMjI0Ni5wbmciLCJ3aWR0aCI6Ijw9NDAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.C4k_wmZMy6IFfmdHb44XNCNTOqNYKsgnRWAGXzSt-oM"
    ),
    Comida(
        nombre = "Chicken Fries",
        calificacion = 4.3f,
        precio = 59.8f,
        imagen = "https://burgerking.com.mt/wp-content/uploads/2020/03/Chicken-fries-500-x-500.png"
    ),
    Comida(
        nombre = "Big Mac",
        calificacion = 4.6f,
        precio = 79.8f,
        imagen = "https://www.pngplay.com/wp-content/uploads/15/Mcdonalds-Big-Mac-Free-PNG.png"
    ),
    Comida(
        nombre = "McFlurry",
        calificacion = 4.7f,
        precio = 49.8f,
        imagen = "https://mcdonalds.com.lb/storage/menu-products/McFlurry-Oreo.png"
    ),
    Comida(
        nombre = "Chicken Nuggets",
        calificacion = 4.0f,
        precio = 45.0f,
        imagen = "https://static.vecteezy.com/system/resources/thumbnails/036/498/581/small/ai-generated-chicken-nuggets-with-a-transparent-background-png.png"
    )
)