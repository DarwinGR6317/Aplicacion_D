package com.example.aplicacion_d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_comenzar : Button = findViewById(R.id.btn_comenzar)
        val dato : EditText = findViewById(R.id.txt_dato)

        btn_comenzar.setOnClickListener {
            val dato = dato.text.toString()
            val  intent =Intent(this, Bienvenida::class.java).apply {
                putExtra("dato",dato)
            }
            startActivity(intent)
        }
    }
}