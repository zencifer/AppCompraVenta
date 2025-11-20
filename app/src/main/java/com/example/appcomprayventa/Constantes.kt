package com.example.appcomprayventa


import android.text.format.DateFormat
import java.util.Locale
import java.util.Calendar

object Constantes {

    const val anuncio_disponible = "Disponible"
    const val anuncio_vendido = "Vendido"

    val categorias = arrayOf(
        "Celulares",
        "PCs/Laptops",
        "Electronica y electrodomesticos",
        "Automoviles",
        "Consolas y videojuegos",
        "Hogar y muebles",
        "Belleza y cuidado personal",
        "Libros",
        "Deportes"
    )

    val condiciones = arrayOf(
        "Nuevo",
        "Usado",
        "Renovado"
    )

    fun ObtenerTiempoDis() : Long {
        return System.currentTimeMillis()
    }


    fun obtenerFecha(tiempo: Long): String {
        val calendario = Calendar.getInstance(Locale.ENGLISH)
        calendario.timeInMillis = tiempo

        // ✅ Forma correcta de usar DateFormat.format()
        return DateFormat.format("dd/MM/yyyy", calendario).toString()
    }

    fun obtenerTiempoDis(): Long {
        return System.currentTimeMillis()
    }
}