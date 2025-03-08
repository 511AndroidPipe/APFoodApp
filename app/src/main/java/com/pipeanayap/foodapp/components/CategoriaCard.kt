package com.pipeanayap.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.pipeanayap.foodapp.models.Categoria
import com.pipeanayap.foodapp.models.categoryList
import com.pipeanayap.foodapp.ui.theme.FoodAppTheme

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun CategoriaCard(categoria: Categoria){
    Column {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .background(Color.Red)
                .width(100.dp)
                .height(100.dp)
                .padding(16.dp),
            contentAlignment = Alignment.Center // Centra la imagen dentro del Box

        ){
            GlideImage(
                model = categoria.imagen,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Text(
            modifier = Modifier
                .padding(top = 8.dp) // Espaciado entre el Box y el texto
                .align(Alignment.CenterHorizontally),
            text = categoria.nombre,
            fontSize = 14.sp
        )
    }

}

@Preview
@Composable
fun CategoriaCardPreview(){
    FoodAppTheme  {
        CategoriaCard(categoria = categoryList[0])
    }
}