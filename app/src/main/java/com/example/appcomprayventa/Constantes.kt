package com.example.appcomprayventa


import android.text.format.DateFormat
import java.util.Locale
import java.util.Calendar

object Constantes {

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