package com.android.proyecto_integrador.Screen

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.android.proyecto_integrador.Screen.Componente.DefaultTopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ventas(navigationController: NavHostController) {
    Scaffold(
        topBar = {
            DefaultTopBar(title = "Ventas", upAvailable = true , navigationController)
        },
        content = {
ContntVentas()
        },
        floatingActionButton = {
            BottonFlotingVentas(navigationController)
        }
        )


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContntVentas(){
Column(modifier = Modifier.padding(top = 70.dp)) {
    val context = LocalContext.current
    val ano = arrayOf("2024", "2023", "2022", "2021", "2020")
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(ano[0]) }
    Row (modifier = Modifier.padding(horizontal = 10.dp)) {
        Box(
            modifier = Modifier
                .width(200.dp)

        ) {
            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = {
                    expanded = !expanded
                }
            ) {
                TextField(
                    value = selectedText,
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                    modifier = Modifier.menuAnchor(),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color(0xff67A4FF), unfocusedBorderColor = Color.Black,
                )
                )

                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    ano.forEach { item ->
                        DropdownMenuItem(
                            text = { Text(text = item) },
                            onClick = {
                                selectedText = item
                                expanded = false
                                Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                            }
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        //Meses
        val contextDos = LocalContext.current
        val meses = arrayOf("Enero", "febrero", "marzo", "mayo", "junio","Julio","agosto","septiembre","octubre","noviembre","diciembre")
        var expandedDos by remember { mutableStateOf(false) }
        var selectedTextDos by remember { mutableStateOf(meses[0]) }
        Box(
            modifier = Modifier
                .width(300.dp)

        ) {
            ExposedDropdownMenuBox(
                expanded = expandedDos,
                onExpandedChange = {
                    expandedDos = !expandedDos
                }
            ) {
                TextField(
                    value = selectedTextDos,
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedDos) },
                    modifier = Modifier.menuAnchor(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(0xff67A4FF), unfocusedBorderColor = Color.Black,
                    )
                )

                ExposedDropdownMenu(
                    expanded = expandedDos,
                    onDismissRequest = { expandedDos = false }
                ) {
                    meses.forEach { item ->
                        DropdownMenuItem(
                            text = { Text(text = item) },
                            onClick = {
                                selectedTextDos = item
                                expandedDos = false
                                Toast.makeText(contextDos, item, Toast.LENGTH_SHORT).show()
                            }
                        )
                    }
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(20.dp))



    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0x2FE2E2E2)
        )
    ) {
        Row(Modifier.fillMaxSize()) {


            //-- box De Datos --
            Box(
                modifier = Modifier
                    .padding(top = 10.dp, end = 15.dp)
                    .width(400.dp)
                    .height(120.dp)
            ) {
                Column (modifier = Modifier.padding(start = 20.dp)) {
                    Row () {
                        Text(
                            text = "2023-1205", fontWeight = FontWeight.Bold

                        )
                        Column {

                            Text(
                                text = "3150.12 €",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 170.dp)
                            )

                            Text(
                                text = "I.V.A :552 €" ,
                                fontSize = 14.sp,
                                modifier = Modifier.padding(start = 170.dp)
                            )
                        }
                    }

                    Text(
                        text = "20 dic 2023",
                        color = Color(0xFF504F4F),
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 0.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Papel Esp Sl",
                        color = Color(0xFF504F4F),
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 0.dp, bottom = 5.dp)
                    )

                }
            }
        }


    }
}




}





@Composable
fun BottonFlotingVentas(navigationController: NavHostController) {
    FloatingActionButton(

        onClick = { navigationController.navigate("FacturaDatosPersonales")   },
        containerColor = Color(0xff67A4FF),
        contentColor = Color.Black
    ) {
        Icon(Icons.Filled.Add, "Small floating action button.")
    }
}

















