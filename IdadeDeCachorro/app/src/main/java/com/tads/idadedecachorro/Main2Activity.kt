package com.tads.idadedecachorro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val dados: Bundle? = intent.extras

        val idadeCachorro = dados?.getString("idade")

        calcular(idadeCachorro.toString())
    }

    private fun calcular(idadeCachorro: String) {

        val idade = idadeCachorro?.toInt()

        val idadeDeHumano = idade * 7

        textIdadeHumanos.setText("A idade do seu cachorro é de " + idadeDeHumano.toString() + " anos humanos.")

    }
}
