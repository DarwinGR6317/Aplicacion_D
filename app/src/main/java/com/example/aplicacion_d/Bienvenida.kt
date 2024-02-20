package com.example.aplicacion_d

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        //recuperara dato
        val datoRecibido =intent.getStringExtra("dato")
        val textViewDRecibido : TextView = findViewById(R.id.textViewDRecibido)
        //mostrar dato
        textViewDRecibido.text = "Bienvenido: $datoRecibido"

        val saltoB : Button = findViewById(R.id.saltoB)

        saltoB.setOnClickListener {
            val  intent = Intent(this, Apellido::class.java).apply {
                
            }
            startActivity(intent)
        }
    }
}