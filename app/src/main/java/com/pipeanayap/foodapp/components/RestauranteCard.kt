package com.pipeanayap.foodapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.pipeanayap.foodapp.models.Restaurante
import com.pipeanayap.foodapp.models.categoryList
import com.pipeanayap.foodapp.models.restaurantList
import com.pipeanayap.foodapp.ui.theme.FoodAppTheme

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun RestauranteCard(restaurante: Restaurante){
    Column {
        GlideImage(
            modifier = Modifier
                .width(100.dp)
                .height(100.dp),
            model = restaurante.imagen,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier
                .padding(top = 8.dp) // Espaciado entre el Box y el texto
                .align(Alignment.CenterHorizontally),
            text = restaurante.nombre,
            fontSize = 14.sp
        )
    }
}

@Preview
@Composable
fun RestauranteCardPreview(){
    FoodAppTheme  {
        RestauranteCard(restaurante = restaurantList[0])
    }
}