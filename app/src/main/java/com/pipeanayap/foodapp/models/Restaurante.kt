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
    ),
    Restaurante(
        nombre = "MR Q",
        imagen = "https://www.mrqchinese.com/wp-content/uploads/2022/05/cropped-MR-Q-favicon.png"
    ),
    Restaurante(
        nombre = "Ciao Pizza",
        imagen = "https://static.wixstatic.com/media/803a1c_1d3539f3ffcb447ea06151e5b5718231~mv2.png/v1/fill/w_560,h_560,al_c,q_85,usm_0.66_1.00_0.01,enc_avif,quality_auto/Logo_CiaoCiaolg.png"    )
)