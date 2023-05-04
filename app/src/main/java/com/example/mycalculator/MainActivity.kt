package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var tieFirstNumber: TextInputEditText
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var tieSecondNumber: TextInputEditText
    lateinit var btnPlus:Button
    lateinit var btnMinus:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivide:Button
    lateinit var tvResult:TextView
    var num1 by Delegates.notNull<Double>()
    var num2 by Delegates.notNull<Double>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tilFirstNumber=findViewById(R.id.tilfirstNumber)
        tilSecondNumber=findViewById(R.id.tilSecondNumber)
        tieFirstNumber=findViewById(R.id.tieFirstNumber)
        tieSecondNumber=findViewById(R.id.tieSecondNumber)
        btnPlus=findViewById(R.id.btnPlus)
        btnMinus=findViewById(R.id.btnMinus)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnDivide=findViewById(R.id.btnDivide)
        tvResult=findViewById(R.id.btnResult)


    }
    fun clickListener(){
        btnPlus!!.setOnClickListener {
            num1=tieFirstNumber!!.text.toString().toDouble()
            num2=tieSecondNumber!!.text.toString().toDouble()
            var result=num1!!+num2!!
            tvResult!!.text=result.toString()


        }

        btnMinus!!.setOnClickListener {
            num1 = tieFirstNumber!!.text.toString().toDouble()
            num2 = tieSecondNumber!!.text.toString().toDouble()
            var result = num1!! - num2!!
            tvResult!!.text = result.toString()

        }


        btnMultiply!!.setOnClickListener {
            num1 = tieFirstNumber!!.text.toString().toDouble()
            num2 = tieSecondNumber!!.text.toString().toDouble()
            var result = num1!! * num2!!
            tvResult!!.text = result.toString()


        }

        btnDivide!!.setOnClickListener {
            num1 = tieFirstNumber!!.text.toString().toDouble()
            num2 = tieSecondNumber!!.text.toString().toDouble()
            var result = num1!! / num2!!
            tvResult!!.text = result.toString()


        }

    }
}