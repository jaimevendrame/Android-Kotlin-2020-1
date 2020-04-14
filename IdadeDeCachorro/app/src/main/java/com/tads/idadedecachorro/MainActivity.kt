package com.tads.idadedecachorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            //pegando idade da activity
            val idadeCachorro = edit_idade_cachorro.text.toString()

            val intent = Intent(applicationContext, Main2Activity::class.java)

            //passandos dados
            intent.putExtra("idade", idadeCachorro)

            //iniciando outra activity
            startActivity(intent)

        }
    }
}
