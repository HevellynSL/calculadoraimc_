package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt_peso= findViewById <TextInputEditText> (R.id.edtpeso)
        val edt_altura =findViewById <TextInputEditText> (R.id.edtaltura)
        val botao:Button =findViewById(R.id.button)

        botao.setOnClickListener{

            val pesoStr= edt_peso.toString()
            val alturaStr= edt_altura.toString()

            if (alturaStr.isNotEmpty()&& pesoStr.isNotEmpty()){

                val peso : Float = edt_peso.text.toString().toFloat()
                val altura: Float = edt_altura.text.toString().toFloat()

                val alturafinal: Float = altura * altura
                val result: Float = peso / alturafinal







            }


        }
    }
}