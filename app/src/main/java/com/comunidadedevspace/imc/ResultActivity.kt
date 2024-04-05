package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val imc = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvresult = findViewById<TextView>(R.id.tv_result)
        val tvclassificaçao = findViewById<TextView>(R.id.tv_classificação)
        tvresult.text = imc.toString()

        val classificaçao: String = if (imc < 18.5){
             "Abaixo do peso"
        }else if (imc >=18.5 && imc <= 24.9){
             "Peso ideal"
        }else if(imc >= 25.0 && imc <= 29.9){
             "Acima do peso, Obesidade grau 1"
        }else if(imc >= 30.0 && imc <= 39.9){
             "Acima do peso, Obesidade grau 2"
        }else {
             "Acima do peso, Obesidade grau 3"
        }

        tvclassificaçao.text = classificaçao

        println ("Seu imc é: " + imc)

    }
}