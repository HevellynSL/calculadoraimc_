package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val Key_Result_IMC = "ResultActivity.Key_IMC"
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(Key_Result_IMC , 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao= findViewById<TextView>(R.id.tv_classificacao)
        tvResult.text=result.toString()

        var classificacao: String? = null

        classificacao = if(result<=18.5f){
            "BAIXO PESO"
        }else if (result > 18.5f && result <=24.9f){
            "PESO IDEAL"
        }else if (result >25f && result <=29.9f){
            "SOBREPESO"
        }else if (result >30f && result <=39.9f){
            "OBESIDADE"
        } else {
            "OBESIDADE"
        }
            tvClassificacao.text = classificacao
    }
}