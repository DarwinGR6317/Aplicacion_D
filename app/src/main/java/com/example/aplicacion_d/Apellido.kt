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
        val datop: EditText = findViewById(R.id.txt_apellido)
        val dato =intent.getStringExtra("dato")

        btn_ap.setOnClickListener {
            val datop = datop.text.toString()
            val intent = Intent(this, ViewApellido::class.java).apply {
                putExtra("datop", datop)
                putExtra("dato", dato)
            }
            startActivity(intent)
        }
    }
}