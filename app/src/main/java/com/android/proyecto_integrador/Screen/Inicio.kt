package com.android.proyecto_integrador.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.android.proyecto_integrador.R


@Composable
fun Inicio(navigationController: NavHostController) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff67A4FF))
                .height(550.dp),


            ) {



            Image(
                painterResource(id = R.drawable.pngwing_com),
                contentDescription = null, modifier = Modifier
                    .size(900.dp)
                    .padding(top = 160.dp)
            )
        }
        Row {
            Column(modifier = Modifier.padding(top = 50.dp, start = 30.dp)) {
                Text(text = "Gestión financiera ", fontSize = 32.sp)
                Text(text = "eficiente ", fontSize = 32.sp)
                Text(text = "para tu negocio", fontSize = 32.sp)

            }
            Box(
                modifier = Modifier

                    .padding(start = 30.dp, top = 82.dp)
                    .size(73.dp)


            ) {
                Column {
                    Button(
                        onClick = { navigationController.navigate("iniciar_sesion")  },
                        modifier = Modifier
                            .height(70.dp)
                            .padding(3.dp)
                            .width(70.dp),


                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff67A4FF),
                            contentColor = Color.White
                        ),
                    ) {
                        Icon(
                            Icons.Default.ArrowForward,
                            contentDescription = "",
                            Modifier.fillMaxSize()

                        )
                    }
                }
            }


        }


    }


}