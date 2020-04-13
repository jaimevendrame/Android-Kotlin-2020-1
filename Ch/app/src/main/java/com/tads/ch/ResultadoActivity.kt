package com.tads.ch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados: Bundle? = intent.extras

        val qtdeHomens = dados?.getString("homens")
        val qtdeMulheres = dados?.getString("mulheres")
        val qtdeCriancas = dados?.getString("mulheres")

        calcular(qtdeHomens.toString(), qtdeMulheres.toString(), qtdeCriancas.toString())


    }

    private fun calcular(qtdeHomens: String, qtdeMulheres: String, qtdeCriancas: String) {

        //Converter valores String para números
        val homens = qtdeHomens.toDouble()
        val mulheres = qtdeMulheres.toDouble()
        val criancas = qtdeCriancas.toDouble()

        val carneHomens = homens * 0.3
        val carneMulheres = mulheres * (0.25)

        val linguicaHomens = homens * (0.1)
        val linguicaMulheres = mulheres * (0.05)

        val carneCriancas  = criancas * (0.18)
        val liguicaCriancas = criancas * (0.02)

        val totalCarne = carneHomens + carneMulheres + carneCriancas

        val totalLiguinca = liguicaCriancas + linguicaHomens  + linguicaMulheres

        r_carne.setText(totalCarne.toString() + "Kg")

        r_linguica.setText(totalLiguinca.toString() + "Kg")

    }



}
