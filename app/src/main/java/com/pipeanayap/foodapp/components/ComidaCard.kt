package com.pipeanayap.foodapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.pipeanayap.foodapp.models.Comida
import com.pipeanayap.foodapp.models.foodList
import com.pipeanayap.foodapp.ui.theme.FoodAppTheme

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ComidaCard(comida: Comida){
    Column {
        Box(
            modifier = Modifier
                .width(210.dp)
                .height(150.dp)
                .padding((10.dp))
        ){
            GlideImage(
                model = comida.imagen,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )

            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(18.dp))
                    .background(Color.Red)
                    .width(85.dp)
                    .height(45.dp)
                    .padding(10.dp)
            ) {
                Text(
                    text = "$${comida.precio}",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier.align(Alignment.Center)
                )

                }
        }
        Row(
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Image(
                modifier = Modifier.size(20.dp), // Aumenta el tamaño del icono
                imageVector = Icons.Default.Favorite,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Green)
            )

            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = "${comida.calificacion} ${comida.nombre}",
                fontSize = 18.sp
            )
        }

        }
    }


@Preview
@Composable
fun comidaCardPreview(){
    FoodAppTheme {
        ComidaCard(comida = foodList[0])
    }
}