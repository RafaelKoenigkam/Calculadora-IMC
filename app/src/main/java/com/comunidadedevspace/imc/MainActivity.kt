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

        // colocar ação n botao setOnClickListener
        // recuperar o texto digitado no peso

        val edtpeso = findViewById<TextInputEditText>(R.id.edit_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edit_altura)

        val botaocalcular = findViewById<Button>(R.id.buttoncalcular)

        botaocalcular.setOnClickListener {
            val peso: Float = edtpeso.text.toString().toFloat()
            val altura: Float = edtaltura.text.toString().toFloat()
            val altura2 = altura * altura
            val imc = peso / altura2
            println("Seu IMC é: " + imc)


            println()
        }


    }
}