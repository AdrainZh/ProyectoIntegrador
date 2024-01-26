package com.android.proyecto_integrador.Screen



import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.android.proyecto_integrador.R
import com.android.proyecto_integrador.Screen.Componente.DefaultTopBar


@SuppressLint("SuspiciousIndentation", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Tareas(navController: NavHostController) {
    val colorHex = Color(android.graphics.Color.parseColor("#67A4FF"))


    Scaffold(
        topBar = {
            DefaultTopBar(title = "Tareas", upAvailable = true, navController)
        },
        floatingActionButton = {
        
BottonFloting()
            
        },
        bottomBar = {
                    BottomBar()
        },

    

    content = {


    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(top = 60.dp)
            .verticalScroll(
                rememberScrollState()
            )
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorHex)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(text = "Tarea", fontWeight = FontWeight.Bold)
            Text(text = "T. Estimado", fontWeight = FontWeight.Bold)
            Text(text = "T. Real", fontWeight = FontWeight.Bold)
            Text(text = "Estado", fontWeight = FontWeight.Bold)

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Tarea x")
            Text(text = "60'")
            Text(text = "80'")
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(Color.Green)
            )

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Tarea y")
            Text(text = "60'")
            Text(text = "80'")
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(Color.Green)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Tarea z")
            Text(text = "60'")
            Text(text = "--'")
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(Color.Red)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(top = 20.dp)
                .padding(start = 155.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Volver al menú", fontWeight = FontWeight.Bold)

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp)
                .padding(top = 430.dp)
                .padding(start = 60.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }
    }
        },

        )
}
@Composable
fun BottonFloting() {
    FloatingActionButton(

        onClick = {  },
        containerColor = Color(0xff67A4FF),
        contentColor = Color.Black
    ) {
        Icon(Icons.Filled.Add, "Small floating action button.")
    }
}
@Composable
fun BottomBar() {
    BottomAppBar(containerColor = Color(0x2F9E9D9D), modifier = Modifier
        .height(70.dp)
        .padding()) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 70.dp),


            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Create,
                    contentDescription = "Icono",
                    tint = Color.Black,
                    modifier = Modifier.size(38.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {

                    Icon(
                        imageVector = Icons.Outlined.Delete,
                        contentDescription = "Icono",
                        tint = Color.Black,
                        modifier = Modifier.size(36.dp)

                    )

            }








        }
    }
}
