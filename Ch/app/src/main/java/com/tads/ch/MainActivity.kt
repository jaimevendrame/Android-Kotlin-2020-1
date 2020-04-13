package com.tads.ch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_calcular.setOnClickListener {

            val qtdHomens = edit_homens.text.toString()
            val qtdMulheres = edit_mulheres.text.toString()
            val qtdCrianca = edit_criancas.text.toString()

            val intent = Intent(applicationContext, ResultadoActivity::class.java)

            //passandos dados

            intent.putExtra("homens", qtdHomens)
            intent.putExtra("mulheres", qtdMulheres)
            intent.putExtra("criancas", qtdCrianca)


            startActivity(intent)
        }

    }


}
