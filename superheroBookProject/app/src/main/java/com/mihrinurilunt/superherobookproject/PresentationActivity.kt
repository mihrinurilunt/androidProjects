package com.mihrinurilunt.superherobookproject

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PresentationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentation)

        val textView = findViewById<TextView>(R.id.textView)

        val intent = intent
        val chosenHeroName = intent.getStringExtra("heroName")
        textView.text=chosenHeroName

        val imageView = findViewById<ImageView>(R.id.imageView)

        val chosenHeroPic = intent.getIntExtra("heroPic",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,chosenHeroPic)
        imageView.setImageBitmap(bitmap)


        /*
                val chosenHero = SingletonClass.ChosenHero
                val chosenHeroPic = chosenHero.photo
                imageView.setImageBitmap(chosenHeroPic)

        */

    }
}