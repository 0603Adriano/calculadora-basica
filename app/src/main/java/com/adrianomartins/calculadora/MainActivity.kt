package com.adrianomartins.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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

        btnSoma.setOnClickListener(){

        }

        btnSub.setOnClickListener(){

        }

        btnMult.setOnClickListener(){

        }

        btnDiv.setOnClickListener(){

        }
    }

}