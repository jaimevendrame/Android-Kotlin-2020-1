package com.example.alcoolougasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btCalcular(view: View){
        //recuperar valores
//        val precoAlcool = findViewById<EditText>(R.id.edit_preco_alcool)
        val precoAlcool = edit_preco_alcool.text.toString()
        val precoGasolina = edit_preco_gasolina.text.toString()

        val validaCampo = validaCampo(precoAlcool, precoGasolina)

        if ( validaCampo ){
            calcularMelhorPreco(precoAlcool, precoGasolina)
        } else {
            text_resultado.setText("Preencha os preços primeiro!")
        }
    }

    fun validaCampo( precoAlcool:String, precoGasolina:String) : Boolean{

        var camposValidos:Boolean = true

        if ( precoAlcool == null || precoAlcool.equals("")){

            camposValidos = false

        } else if ( precoGasolina == null || precoGasolina.equals("")){

            camposValidos = false

        }

        return camposValidos
    }

    fun calcularMelhorPreco(precoAlcool: String, precoGasolina: String){
        //Converter valores String para números
        val valorAlcool = precoAlcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()

        /*Faz cálculo ( precoAlcool / precoGasolina )
        * Se resultado >= 0.7 melhor utilizar Gasolina
        * senao melhor Alcool
         */

        val resultadoPreco = valorAlcool / valorGasolina

        if ( resultadoPreco >= 0.7){
            text_resultado.setText("Melhor usar Gasolina!!")
        } else {
            text_resultado.setText("Melhor usar Alcool!!")
        }
    }

}
