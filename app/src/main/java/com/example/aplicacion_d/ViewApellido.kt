package com.example.aplicacion_d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ViewApellido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_apellido)

        val datoRecibidoP =intent.getStringExtra("datop")
        val datoRecibido =intent.getStringExtra("dato")

        val textViewAp : TextView =findViewById(R.id.textViewAp)
        //mostrar dato
        textViewAp.text =  "Su nombre es: $datoRecibido y su apellido es: $datoRecibidoP"

    }
}