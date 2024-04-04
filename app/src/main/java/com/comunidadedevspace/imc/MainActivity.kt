package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        // Criar uma variavel e associar o componente de UI<edittext>
        //Recuperar botão da tela

        val edtpeso = findViewById<TextInputEditText>(R.id.edit_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edit_altura)

        val botaocalcular = findViewById<Button>(R.id.button)

        botaocalcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text
        }


    }
}