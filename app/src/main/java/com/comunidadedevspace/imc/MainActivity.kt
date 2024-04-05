package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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


            val pesostr: String = edtpeso.text.toString()
            val alturastr: String = edtaltura.text.toString()

            if (pesostr == "" || alturastr == "") {
                //mostrar msg para o user

                Snackbar
                    .make(
                    edtpeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()

            } else {
                val peso = pesostr.toFloat()
                val altura = alturastr.toFloat()

                val altura2 = altura * altura
                val imc = peso / altura2

                println("Seu IMC é: " + imc)
            }


            println()
        }


    }
}