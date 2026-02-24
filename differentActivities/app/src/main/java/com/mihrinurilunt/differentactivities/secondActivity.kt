package com.mihrinurilunt.differentactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView2=findViewById<TextView>(R.id.textView2)

        //ilk sayfadan yollanan veriyi alıyoruz
        val intent = intent
        var alinanVeri= intent.getStringExtra("yollananVeri")
        textView2.text=alinanVeri
    }

    fun geriDon(view: View){

        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}

