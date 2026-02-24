package com.mihrinurilunt.mathoperationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //!!
    /*private val num1 = findViewById<EditText>(R.id.editText2).text.toString().toIntOrNull()
    private val num2 = findViewById<EditText>(R.id.editText2).text.toString().toIntOrNull()
    private val resultText = findViewById<TextView>(R.id.textView)*/

    var num1:Double?=null
    var num2:Double?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toplama(view: View) {
         num1 = findViewById<EditText>(R.id.editText2).text.toString().toDoubleOrNull()
         num2 = findViewById<EditText>(R.id.editText2).text.toString().toDoubleOrNull()
        var resultText = findViewById<TextView>(R.id.textView)
        if (num1 == null || num2 == null) {
            resultText.text = "geçerli input giriniz"
        } else {
            resultText.text="result: ${(num1!!+num2!!).toString()}"

        }
    }

    fun cikarma(view: View) {
         num1 = findViewById<EditText>(R.id.editText2).text.toString().toDoubleOrNull()
         num2 = findViewById<EditText>(R.id.editText2).text.toString().toDoubleOrNull()
        var resultText = findViewById<TextView>(R.id.textView)
        if (num1 == null || num2 == null) {
            resultText.text = "geçerli input giriniz"
        } else {
            resultText.text="result: ${(num1!!-num2!!).toString()}"
        }
    }

    fun bolme(view: View) {
         num1 = findViewById<EditText>(R.id.editText2).text.toString().toDoubleOrNull()
         num2 = findViewById<EditText>(R.id.editText2).text.toString().toDoubleOrNull()
        val resultText = findViewById<TextView>(R.id.textView)
        if (num1 == null || num2 == null) {
            resultText.text = "geçerli input giriniz"
        } else {
            resultText.text="result: ${(num1!!/num2!!).toString()}"
        }
    }

    fun carpma(view: View) {
         num1 = findViewById<EditText>(R.id.editText2).text.toString().toDoubleOrNull()
         num2 = findViewById<EditText>(R.id.editText2).text.toString().toDoubleOrNull()
        var resultText = findViewById<TextView>(R.id.textView)
        if (num1 == null || num2 == null) {
            resultText.text = "geçerli input giriniz"
        } else {
            resultText.text="result: ${(num1!!*num2!!).toString()}"
        }
    }

}