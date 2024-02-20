package com.example.aplicacion_d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent

class Apellido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apellido)

        val btn_ap: Button = findViewById(R.id.btn_ap)
        val dato: EditText = findViewById(R.id.txt_apellido)

        btn_ap.setOnClickListener {
            val datop = dato.text.toString()
            val intent = Intent(this, ViewApellido::class.java).apply {
                putExtra("datop", datop)
            }
            startActivity(intent)
        }
    }
}