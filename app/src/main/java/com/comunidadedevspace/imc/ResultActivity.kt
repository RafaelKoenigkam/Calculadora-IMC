package com.comunidadedevspace.imc

import android.os.Bundle
import android.view.textclassifier.TextClassification
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

        val classificaçao: String
        val cor: Int

        if (imc <= 18.5f) {
            classificaçao = "Abaixo do peso"
           cor = getColor(R.color.abaixodopeso)
        } else if (imc > 18.5f && imc <= 24.9f) {
             classificaçao = "NORMAL"
            cor = getColor(R.color.normal)
        } else if (imc > 25f && imc <= 29.9f) {
             classificaçao = "Sobrepeso "
            cor = getColor(R.color.sobrepeso)
        } else if (imc > 30f && imc <= 39.9f) {
             classificaçao = "Obesidade grau 2"
            cor = getColor(R.color.obesidade1)
        } else {
             classificaçao = "Obesidade grau 3"
            cor = getColor(R.color.obesidade2)
        }

        tvclassificaçao.text = classificaçao
        tvclassificaçao.setTextColor(cor)

        println ("Seu imc é: " + imc)

    }
}