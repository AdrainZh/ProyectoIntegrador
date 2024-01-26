package com.android.proyecto_integrador.navigation



sealed class AppScreens(val ruta: String) {


object  Home : AppScreens("Home")
    object  iniciar_sesion : AppScreens("iniciar_sesion")
    object  Inicio : AppScreens("Inicio")
    object  Registro : AppScreens("Registro")
    object  Ventas : AppScreens("Ventas")
    object  Tareas : AppScreens("Tareas")
    object  Factura : AppScreens("Factura")
    object  FacturaDatosCliente : AppScreens("FacturaDatosCliente")
    object  FacturaDatosPersonales : AppScreens("FacturaDatosPersonales")


}