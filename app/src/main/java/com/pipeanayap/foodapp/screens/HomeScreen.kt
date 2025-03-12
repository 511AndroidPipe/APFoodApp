package com.pipeanayap.foodapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pipeanayap.foodapp.components.CategoriaCard
import com.pipeanayap.foodapp.components.ComidaCard
import com.pipeanayap.foodapp.components.RestauranteCard
import com.pipeanayap.foodapp.models.categoryList
import com.pipeanayap.foodapp.models.foodList
import com.pipeanayap.foodapp.models.restaurantList
import com.pipeanayap.foodapp.utils.Logout
import com.pipeanayap.foodapp.ui.theme.FoodAppTheme

@Composable
fun HomeScreen( innerPadding:PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(15.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Image(
                modifier = Modifier.size(40.dp), // Aumenta el tamaño del icono
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Red)
            )

            Text(
                text = "Hola, Pipe",
                fontSize = 30.sp,
                modifier = Modifier
                    .weight(1f) // Empuja el icono de la derecha
                    .padding(start = 15.dp)
            )

            Image(
                modifier = Modifier.size(40.dp), // Aumenta el tamaño del icono
                imageVector = Logout, // Usa el icono correcto (puedes cambiarlo)
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Red)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "Nuestras categorias",
            fontSize = 24.sp
            
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(categoryList) { categoria ->
                CategoriaCard(categoria = categoria)
            }
        }
        Text(
            modifier = Modifier
                .padding(top = 25.dp),
            text = "Busca los mejores restaurantes",
            fontSize = 24.sp
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(restaurantList) { restaurante ->
                RestauranteCard(restaurante = restaurante)
            }
        }
        Text(
            modifier = Modifier
                .padding(vertical = 25.dp),
            text = "Nuestras mejores comidas",
            fontSize = 24.sp
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            items(foodList) { comida ->
                ComidaCard(comida = comida)
            }
        }



    }
}


@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL
)

@Composable
fun HomeScreenPreview(){
    FoodAppTheme{
        HomeScreen(innerPadding = PaddingValues(28.dp))
    }
}
