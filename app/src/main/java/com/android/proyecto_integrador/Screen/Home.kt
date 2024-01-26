package com.android.proyecto_integrador.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.android.proyecto_integrador.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navigationController: NavHostController) {


    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

        Row {
            Row {
                Image(
                    painterResource(id = R.drawable.logohome),
                    contentDescription = null,
                    modifier = Modifier

                        .size(60.dp)

                )
                Text(
                    text = "AutonomApp",
                    modifier = Modifier.padding(top = 16.dp),
                    fontSize = 16.sp,
                    color = Color(0xff7777777)
                )
            }

            Column(modifier = Modifier.padding(start = 130.dp, top = 16.dp)) {
                Image(
                    painterResource(id = R.drawable.search_interface_symbol),
                    contentDescription = null,
                    modifier = Modifier.size(22.dp)
                )
                Text(text = "Buscador", fontSize = 12.sp)
            }
            Column(modifier = Modifier.padding(top = 16.dp, start = 14.dp)) {
                Image(
                    painterResource(id = R.drawable.app),
                    contentDescription = null,
                    modifier = Modifier.size(22.dp)
                )
                Text(text = "Menú", fontSize = 12.sp)
            }


        }
        Column(modifier = Modifier.padding(bottom = 20.dp, start = 20.dp)) {
            Text(text = "Hola , Ramzi", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Row {
                Text(text = "Tu Dinero", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Image(
                    painterResource(id = R.drawable.info),
                    contentDescription = null,
                    modifier = Modifier
                        .size(22.dp)
                        .padding(start = 4.dp)
                )

            }
            Text(text = "28671.87 €")
            Image(
                painterResource(id = R.drawable.pantalla),
                contentDescription = null,
                modifier = Modifier
                    .width(400.dp)
                    .padding(top = 10.dp)
            )
        }

        Row(modifier = Modifier.padding(start = 30.dp)) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(90.dp)
                    .height(30.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0x2FCACACA),
                    disabledContainerColor = Color(0xFF292929),
                    contentColor = Color.Black,
                    disabledContentColor = Color.White

                )
            ) {
                Text(text = "Resumen", fontSize = 11.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(90.dp)
                    .height(30.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0x2FCACACA),
                    disabledContainerColor = Color(0xFFD5D5D5),
                    contentColor = Color.Black,
                    disabledContentColor = Color.White

                )


            ) {
                Text(text = "Movimientos", fontSize = 11.sp)


            }

        }
        Row(modifier = Modifier.padding(20.dp)) {
            Divider(
                Modifier
                    .background(Color(0xFFF9FF9))
                    .height(0.5.dp)
                    .weight(1f)
            )

        }
        Column {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { navigationController.navigate("Ventas") }
                    .height(100.dp)
                    .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0x2FE2E2E2)
                )
            ) {
                Row(Modifier.fillMaxSize()) {
                    //--Box Image --
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .padding(top = 10.dp, end = 10.dp, start = 10.dp)

                    ) {
                        Image(
                            painterResource(id = R.drawable.ventass),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(16.dp))


                        )
                    }

                    //-- box De Datos --
                    Box(
                        modifier = Modifier
                            .padding(top = 10.dp, end = 15.dp)
                            .width(300.dp)
                            .height(90.dp)
                    ) {
                        Column {
                            Row {
                                Text(
                                    text = "Ventas", fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "18150.12 €",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(start = 115.dp)
                                )
                            }

                            Text(
                                text = "48 Movimientos",
                                color = Color(0xFF504F4F),
                                fontSize = 14.sp,
                                modifier = Modifier.padding(top = 3.dp, bottom = 5.dp)
                            )

                        }
                    }
                }


            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0x2FE2E2E2)
                )
            ) {
                Row(Modifier.fillMaxSize()) {
                    //--Box Image --
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .padding(top = 10.dp, end = 10.dp, start = 10.dp)

                    ) {
                        Image(
                            painterResource(id = R.drawable.ventas),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(16.dp))


                        )
                    }

                    //-- box De Datos --
                    Box(
                        modifier = Modifier
                            .padding(top = 10.dp, end = 15.dp)
                            .width(300.dp)
                            .height(90.dp)
                    ) {
                        Column {
                            Row {
                                Text(
                                    text = "Compras", fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "-15000.00 €",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(start = 90.dp)
                                )
                            }

                            Text(
                                text = "32 Movimientos",
                                color = Color(0xFF504F4F),
                                fontSize = 14.sp,
                                modifier = Modifier.padding(top = 3.dp, bottom = 5.dp)
                            )

                        }
                    }
                }


            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0x2FE2E2E2)
                )
            ) {
                Row(Modifier.fillMaxSize()) {
                    //--Box Image --
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .padding(top = 10.dp, end = 10.dp, start = 10.dp)

                    ) {
                        Image(
                            painterResource(id = R.drawable.imouestos),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(16.dp))


                        )
                    }

                    //-- box De Datos --
                    Box(
                        modifier = Modifier
                            .padding(top = 10.dp, end = 15.dp)
                            .width(300.dp)
                            .height(90.dp)
                    ) {
                        Column {
                            Row {
                                Text(
                                    text = "Impuestos", fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "-2150.12 €",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(start = 90.dp)
                                )
                            }

                            Text(
                                text = "10 Movimientos",
                                color = Color(0xFF504F4F),
                                fontSize = 14.sp,
                                modifier = Modifier.padding(top = 3.dp, bottom = 5.dp)
                            )

                        }
                    }
                }


            }

        }
Spacer(modifier = Modifier.height(12.dp))
        BottomAppBar(containerColor = Color(0x2F9E9D9D), modifier = Modifier
            .height(70.dp)
            .padding(top = 20.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxSize(),

                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Rounded.Home,
                        contentDescription = "Icono",
                        tint = Color.Black,
                        modifier = Modifier.size(48.dp)
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Rounded.Email,
                        contentDescription = "Icono",
                        tint = Color.Black,
                        modifier = Modifier.size(48.dp)
                    )
                }


                IconButton(onClick = { navigationController.navigate("Tareas") }) {
                    Icon(
                        imageVector = Icons.Rounded.DateRange,
                        contentDescription = "Icono",
                        tint = Color.Black,
                        modifier = Modifier.size(48.dp)
                    )
                }


                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.Person,
                        contentDescription = "Icono",
                        tint = Color.Black,
                        modifier = Modifier
                            .size(48.dp)
                            .clickable { })
                }


            }
        }
    }
}













