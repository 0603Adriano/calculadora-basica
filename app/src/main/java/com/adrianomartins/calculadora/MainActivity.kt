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

            val soma = n1 + n2
            val resultado = "$n1 + $n2 = $soma"
            exibirResultado(resultado)
        }

        btnSub.setOnClickListener {
            val n1: Double = "${num1.text}".toDouble()
            val n2: Double = "${num2.text}".toDouble()

            val sub = n1 - n2
            val resultado = "$n1 - $n2 = $sub"
            exibirResultado(resultado)
        }

        btnMult.setOnClickListener {
            val n1: Double = "${num1.text}".toDouble()
            val n2: Double = "${num2.text}".toDouble()

            val mult = n1 * n2
            val resultado = "$n1 * $n2 = $mult"
            exibirResultado(resultado)
        }

        btnDiv.setOnClickListener {
            val n1: Double = "${num1.text}".toDouble()
            val n2: Double = "${num2.text}".toDouble()

            val div = n1 / n2
            val resultado = "$n1 / $n2 = $div"
            exibirResultado(resultado)
        }

        btnPercent.setOnClickListener {
            val n1: Double = "${num1.text}".toDouble()
            val n2: Double = "${num2.text}".toDouble()

            val percent = (n1 / 100) * n2
            val resultado = "$n1 % de $n2 = $percent"
            exibirResultado(resultado)
        }

        btnElev.setOnClickListener {
            val n1: Int = "${num1.text}".toInt()
            val n2: Int = "${num2.text}".toInt()
            var operation = 0
            var elevado = n1

            for (i in 2..n2) {
                operation = elevado * n1
                elevado *= n1
            }

            val resultado = "$n1 ^ $n2 = $operation"

            exibirResultado(resultado.toString())
        }

        btnFatorial.setOnClickListener {
            val n1: Int = "${num1.text}".toInt()
            var valor = n1

            for (i in valor - 1 downTo 1) valor *= i

            var downToNumber = ""

            for (i in n1 downTo 2){
                downToNumber += "$i."
            }

            ("$n1! = ${downToNumber}1 = $valor".apply { exibirResultado(this) })
        }
    }

    fun exibirResultado(resultado: String) {
        val txtResultado: TextView = findViewById(R.id.txtResultado)
        txtResultado.text = resultado
    }

}