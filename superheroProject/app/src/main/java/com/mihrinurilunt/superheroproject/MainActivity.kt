package com.mihrinurilunt.superheroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var scopeOrnegi=10

    private var name =""
    private var age :Int?=null
    private var job = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Scope-Kapsam -> sınıfın içinde fonkların dışında tanımladığın bir variable'a her yerden erişebilirsin
        /*kod blokları oluşturduğumuz her yer aslında bir kapsamdır (for,if-else,fun gibi) ve bu kapsamlar
          içinde oluşturduğumuz varlara kapsamlar dışından ulaşamayız*/
    }

    fun createSuperhero(view : View){ //View yazmak çok önemli

         name = findViewById<EditText>(R.id.nameText).text.toString()
         age = findViewById<EditText>(R.id.ageText).text.toString().toIntOrNull()  //**
         job = findViewById<EditText>(R.id.jobText).text.toString()
         val result = findViewById<TextView>(R.id.resultText)

        /*val name = nameText.text.toString()  //nameText editable diye ayrı bi type var bu yüzden stringe çeviriyoruz
        val age = ageText.text.toString().toIntOrNull()   //!!
        val job = jobText.text.toString()*/

        //val superhero=Superhero(name,age,job)  //age'e soru işareti de koymalısın çünkü yukarda ya in ya null diye tanımladıdk

        if(age==null){    //yaş yerine bir yazı da girebilir o zaman null olur onu kontrol ediyoruz
            result.text="write an correct input"
        }else{
            val superhero=Superhero(name,age!!,job)  //burda age'e soru işareti koymaya gerek yok çünkü zaten ifle kontrol ediyoruz
            result.text = "Name: ${superhero.name}, Age:${superhero.age}, job:${superhero.job}"
        }




    }
}