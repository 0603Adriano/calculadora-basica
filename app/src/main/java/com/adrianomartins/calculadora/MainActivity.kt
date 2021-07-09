package com.adrianomartins.calculadora

import android.inputmethodservice.Keyboard
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.contentValuesOf

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1: EditText = findViewById(R.id.editTextNum1)
        var num2: EditText = findViewById(R.id.editTextNum2)

        var btnSoma: Button = findViewById(R.id.btnSoma)
        var btnSub: Button = findViewById(R.id.btnSub)
        var btnMult: Button = findViewById(R.id.btnMult)
        var btnDiv: Button = findViewById(R.id.btnDiv)
        var btnPercent: Button = findViewById(R.id.btnPorcentagem)
        var btnElev: Button = findViewById(R.id.btnElevado)
        var btnFatorial: Button = findViewById(R.id.btnFatorar)

        btnSoma.setOnClickListener(){
            var n1: Double = "${num1.text}".toDouble()
            var n2: Double = "${num2.text}".toDouble()

            var resultado: Double = n1 + n2
            exibirResultado(resultado.toString())
        }

        btnSub.setOnClickListener(){
            var n1: Double = "${num1.text}".toDouble()
            var n2: Double = "${num2.text}".toDouble()

            var resultado: Double = n1 - n2
            exibirResultado(resultado.toString())
        }

        btnMult.setOnClickListener(){
            var n1: Double = "${num1.text}".toDouble()
            var n2: Double = "${num2.text}".toDouble()

            var resultado: Double = n1 * n2
            exibirResultado(resultado.toString())
        }

        btnDiv.setOnClickListener(){
            var n1: Double = "${num1.text}".toDouble()
            var n2: Double = "${num2.text}".toDouble()

            var resultado: Double = n1 / n2
            exibirResultado(resultado.toString())
        }

        btnPercent.setOnClickListener(){
            var n1: Double = "${num1.text}".toDouble()
            var n2: Double = "${num2.text}".toDouble()

            var resultado = (n1/100) * n2
            exibirResultado(resultado.toString())
        }

        btnElev.setOnClickListener(){
           /* var n1: Int = "${num1.text}".toInt()
            var n2 = "${num2.text}".toInt()

            var cont = 1

            var fatora = 0

            for (cont in 3 ){
                fatora += n1 * n2

            }

            exibirResultado(resultado.toString())*/
        }

        btnFatorial.setOnClickListener(){
            var n1: Double = "${num1.text}".toDouble()
            var n2: Double = "${num2.text}".toDouble()

            var resultado = (n1*100) / n2
            exibirResultado(resultado.toString())
        }
    }

    fun exibirResultado(resultado: String) {
        var txtResultado: TextView = findViewById(R.id.txtResultado)
        txtResultado.setText(resultado)
    }

}