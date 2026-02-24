package com.mihrinurilunt.superherobookproject

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri hazırlığı

        val superheroNames = ArrayList<String>()
        superheroNames.add("ironman")
        superheroNames.add("doctor strange")
        superheroNames.add("spiderman")
        superheroNames.add("thor")
        superheroNames.add("groot")
        /*superheroNames.add("ironman")
        superheroNames.add("doctor strange")
        superheroNames.add("spiderman")
        superheroNames.add("thor")
        superheroNames.add("groot")
        superheroNames.add("ironman")
        superheroNames.add("doctor strange")
        superheroNames.add("spiderman")
        superheroNames.add("thor")
        superheroNames.add("groot")
        superheroNames.add("ironman")
        superheroNames.add("doctor strange")
        superheroNames.add("spiderman")
        superheroNames.add("thor")
        superheroNames.add("groot")*/

        //foto koymak istediğimizde bitmap kullanıyoruz
        //BitmapFactory --> Crates bitmap objects from various sources, including files, streams and byte-arrays

        //verimsiz tanımlamalar

/*
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ironman)
        val doctorStrangeBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.doctorstrange)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)
        val thorBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.thor)
        val grootBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.groot)

        val superheroPics = ArrayList<Bitmap>()
        superheroPics.add(ironmanBitmap)
        superheroPics.add(doctorStrangeBitmap)
        superheroPics.add(spidermanBitmap)
        superheroPics.add(thorBitmap)
        superheroPics.add(grootBitmap)

*/

        //verimli tanımlamalar

        val ironmanDrawableId = R.drawable.ironman  //bu bildiğin int andorid bu numarayı biliyor
        val doctorStrangeDrawableId = R.drawable.doctorstrange
        val spidermanDrawableId = R.drawable.spiderman
        val thorDrawableId = R.drawable.thor
        val grootDrawableId = R.drawable.groot

        var heroDrawableList = ArrayList<Int>()
        heroDrawableList.add(ironmanDrawableId)
        heroDrawableList.add(doctorStrangeDrawableId)
        heroDrawableList.add(spidermanDrawableId)
        heroDrawableList.add(thorDrawableId)
        heroDrawableList.add(grootDrawableId)



        //Adapter

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView) //!!!

        //recyclerView'muzun nasıl görüneceğini söylüyoruz. oluşturacağımız rowlar linear(alt alta)olsun
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superheroNames, heroDrawableList)
        recyclerView.adapter =adapter

    }
}

//RecyclerView denilen bazı elemanları(dizi içinde mesela)liste şeklinde göstrmize olanak sağlayan bir yapıyı görücez

//normalde uygulama yaparken telif hakkı olmayan fotolar koyman gerekir ya da kendi fotolarını koymalısın bunun için royalty free image diye aratabilirsin


