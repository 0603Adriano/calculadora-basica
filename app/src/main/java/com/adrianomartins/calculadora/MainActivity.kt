package com.adrianomartins.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1: EditText = findViewById(R.id.editTextNum1)
        val num2: EditText = findViewById(R.id.editTextNum2)

        val btnSoma: Button = findViewById(R.id.btnSoma)
        val btnSub: Button = findViewById(R.id.btnSub)
        val btnMult: Button = findViewById(R.id.btnMult)
        val btnDiv: Button = findViewById(R.id.btnDiv)
        val btnPercent: Button = findViewById(R.id.btnPorcentagem)
        val btnElev: Button = findViewById(R.id.btnElevado)
        val btnFatorial: Button = findViewById(R.id.btnFatorar)

        btnSoma.setOnClickListener {
            val n1: Double = "${num1.text}".toDouble()
            val n2: Double = "${num2.text}".toDouble()

            val resultado: Double = n1 + n2
            exibirResultado(resultado.toString())
        }

        btnSub.setOnClickListener {
            val n1: Double = "${num1.text}".toDouble()
            val n2: Double = "${num2.text}".toDouble()

            val resultado: Double = n1 - n2
            exibirResultado(resultado.toString())
        }

        btnMult.setOnClickListener {
            val n1: Double = "${num1.text}".toDouble()
            val n2: Double = "${num2.text}".toDouble()

            val resultado: Double = n1 * n2
            exibirResultado(resultado.toString())
        }

        btnDiv.setOnClickListener {
            val n1: Double = "${num1.text}".toDouble()
            val n2: Double = "${num2.text}".toDouble()

            val resultado: Double = n1 / n2
            exibirResultado(resultado.toString())
        }

        btnPercent.setOnClickListener {
            val n1: Double = "${num1.text}".toDouble()
            val n2: Double = "${num2.text}".toDouble()

            val resultado = (n1 / 100) * n2
            exibirResultado(resultado.toString())
        }

        btnElev.setOnClickListener {
            val n1: Int = "${num1.text}".toInt()
            val n2: Int = "${num2.text}".toInt()
            var resultado = 0
            var elevado = n1

            for (i in 2..n2) {
                resultado = elevado * n1
                elevado *= n1
            }

            exibirResultado(resultado.toString())
        }

        btnFatorial.setOnClickListener {
            var n1: Int = "${num1.text}".toInt()

            for (i in n1 - 1 downTo 1) n1 *= i
            var resultado: Int = n1

            exibirResultado(resultado.toString())
        }
    }

    fun exibirResultado(resultado: String) {
        val txtResultado: TextView = findViewById(R.id.txtResultado)
        txtResultado.text = resultado
    }

}