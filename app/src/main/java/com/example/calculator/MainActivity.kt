package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1:TextInputLayout
    lateinit var etNum1:TextInputEditText
    lateinit var tilNum2:TextInputLayout
    lateinit var etNum2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvResult:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        castViews()

    }

    fun castViews(){
        tilNum1 = findViewById(R.id.tilNum1)
        etNum1 = findViewById(R.id.etNum1)
        tilNum2 = findViewById(R.id.tilNum2)
        etNum2 = findViewById(R.id.etNUm2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)
        validateNums()
    }
    fun validateNums(){
        btnAdd.setOnClickListener {
            val numberOne = etNum1.text.toString().toDouble()
            val numberTwo = etNum2.text.toString().toDouble()
            var output = numberOne+numberTwo
            tvResult.text = output.toString()
        }

        btnSubtract.setOnClickListener {
            val numberOne = etNum1.text.toString().toDouble()
            val numberTwo = etNum2.text.toString().toDouble()
            var output = numberOne-numberTwo
            tvResult.text = output.toString()
        }

        btnMultiply.setOnClickListener {
            val numberOne = etNum1.text.toString().toDouble()
            val numberTwo = etNum2.text.toString().toDouble()
            var output = numberOne*numberTwo
            tvResult.text = output.toString()
        }

        btnModulus.setOnClickListener {
            val numberOne = etNum1.text.toString().toDouble()
            val numberTwo = etNum2.text.toString().toDouble()
            var output = numberOne%numberTwo
            tvResult.text = output.toString()
        }
    }


}