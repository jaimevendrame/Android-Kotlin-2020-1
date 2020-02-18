package com.tads.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto : TextView

    val frases = arrayOf(
        "Fala que odeia falsidade, mas usa Windows pirata.",
        "Digito, logo existo.",
        "Se a vida fosse um cartão de memória, eu formatava e começaria tudo de novo.",
        "Quem nunca nunca sacudiu o mouse para o PC destravar?",
        "99% das pessoas riem quando apertam F13.",
        "Contra prints, não há argumento."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<TextView>(R.id.textoFrase)

    }

    fun gerarFrase(view: View){

        val totalItensArray = frases.size

        val numAleatorio = Random().nextInt( totalItensArray )

        texto.setText( frases[ numAleatorio ])

    }
}
