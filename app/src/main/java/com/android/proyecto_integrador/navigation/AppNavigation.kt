package com.android.proyecto_integrador.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.proyecto_integrador.Screen.Factura
import com.android.proyecto_integrador.Screen.FacturaDatosCliente
import com.android.proyecto_integrador.Screen.FacturaDatosPersonales
import com.android.proyecto_integrador.Screen.Home
import com.android.proyecto_integrador.Screen.Inicio
import com.android.proyecto_integrador.Screen.Registro
import com.android.proyecto_integrador.Screen.Tareas
import com.android.proyecto_integrador.Screen.Ventas
import com.android.proyecto_integrador.Screen.iniciar_sesion


@Composable
fun AppNavigation() {
    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = AppScreens.Inicio.ruta)
    {
        composable(AppScreens.Home.ruta) { Home(navigationController) }
        composable(AppScreens.Inicio.ruta) { Inicio(navigationController) }
        composable(AppScreens.iniciar_sesion.ruta) { iniciar_sesion(navigationController) }
        composable(AppScreens.Registro.ruta) { Registro(navigationController) }
        composable(AppScreens.Ventas.ruta) { Ventas(navigationController) }
        composable(AppScreens.Tareas.ruta) { Tareas(navigationController) }
        composable(AppScreens.Factura.ruta) { Factura(navigationController) }
        composable(AppScreens.FacturaDatosCliente.ruta) { FacturaDatosCliente(navigationController) }
        composable(AppScreens.FacturaDatosPersonales.ruta) { FacturaDatosPersonales(navigationController) }
    }
}