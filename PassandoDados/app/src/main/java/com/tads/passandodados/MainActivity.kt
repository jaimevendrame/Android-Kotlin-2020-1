package com.tads.passandodados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_dados.setOnClickListener {

            val nomeuser = "Jaime Filho"

            val intent = Intent(applicationContext, SegundaActivity::class.java)

            //passandos dados

            intent.putExtra("nome", nomeuser)
            intent.putExtra("idade", 40)


            startActivity(intent)
        }
    }
}
