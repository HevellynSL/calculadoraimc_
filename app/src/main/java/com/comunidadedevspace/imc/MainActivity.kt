package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.ReturnThis
import com.google.android.material.snackbar.Snackbar
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

            val pesoStr= edt_peso.text.toString()
            val alturaStr= edt_altura.text.toString()

            if (pesoStr == "" || alturaStr == ""  ) {
                Snackbar
                    .make(
                    edt_peso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()

            } else {

                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturafinal = altura * altura
                val resultado = peso / alturafinal


                val intent = Intent (this,ResultActivity::class.java)
                  intent.putExtra(Key_Result_IMC, resultado)
                startActivity(intent)



                println("Hevellyn " + resultado)
            }
        }
    }
}