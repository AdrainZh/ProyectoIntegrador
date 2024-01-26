package com.android.proyecto_integrador.Screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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

import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavHostController

import com.android.proyecto_integrador.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FacturaDatosPersonales(navigationController: NavHostController) {

    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var FechaDeNacimiento by remember { mutableStateOf("") }
    var direccion by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }


    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

        TopAppBar(
            title = { },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Outlined.ArrowBack,
                        contentDescription = "Back",
                        tint = Color(0xFF000000),
                        modifier = Modifier.clickable { navigationController.popBackStack() }
                    )
                }
            },
        )
        Box() {
            Column {
                Text(
                    text = "Factura",
                    modifier = Modifier.padding(start = 20.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = "Sus datos personales.       Pasos (1/3)",
                    modifier = Modifier.padding(start = 20.dp),
                    fontSize = 16.sp
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
        ) {
            Column {


                //--- Nombre de el cliente ---
                OutlinedTextField(
                    value = nombre, onValueChange = { nombre = it },
                    label = {
                        Text(
                            text = "Nombre",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.user),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp), maxLines = 1,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(0xCE2268DA), unfocusedBorderColor = Color.Black,
                    )
                )

                //--- Apellidos ---
                OutlinedTextField(
                    value = apellidos, onValueChange = { apellidos= it },
                    label = {
                        Text(
                            text = "Apellidos",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.padlock),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp), maxLines = 1,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(0xff67A4FF), unfocusedBorderColor = Color.Black,
                    )
                )


                //--- Fecha de nacimiento ---
                OutlinedTextField(
                    value = FechaDeNacimiento, onValueChange = { FechaDeNacimiento = it },
                    label = {
                        Text(
                            text = "Fecha de nacimiento ",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.calendar),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp), maxLines = 1,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(0xff67A4FF), unfocusedBorderColor = Color.Black,
                    )
                )
                //--- Dirección ---
                OutlinedTextField(
                    value = direccion, onValueChange = { direccion = it },
                    label = {
                        Text(
                            text = "Dirección",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.maps_and_flags),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp), maxLines = 1,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(0xff67A4FF), unfocusedBorderColor = Color.Black,
                    )
                )
                //--- Número de teléfono ---
                OutlinedTextField(
                    value = telefono, onValueChange = { telefono = it },
                    label = {
                        Text(
                            text = "Número de teléfono",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.telephone),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp), maxLines = 1,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(0xff67A4FF), unfocusedBorderColor = Color.Black,
                    )
                )
                //--- Correo electrónico ---
                OutlinedTextField(
                    value = email, onValueChange = { email = it },
                    label = {
                        Text(
                            text = "Correo electrónico",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.mail),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp), maxLines = 1,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(0xff67A4FF), unfocusedBorderColor = Color.Black,
                    )
                )


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {
                            navigationController.navigate("FacturaDatosCliente")

                        },


                        modifier = Modifier
                            .width(180.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff67A4FF),
                            contentColor = Color.Black,
                        ),
                        shape = RoundedCornerShape(10.dp),
                    ) {
                        Text(text = "Siguiente", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }


        }


    }
}