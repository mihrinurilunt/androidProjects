package com.mihrinurilunt.yemektariflerisqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.FragmentContainer
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        //menüyü bağlama işlemi yapıcaz. bir xmlle burdaki kodu bağlarken layout inflater kullanıcaz!!

        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.yemek_ekle, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {   //menüden bir şey seçilirse ne yapayım

        if(item.itemId == R.id.yemek_ekleme_item){  //bir sürü item olabilir bunu yapmak çok önemli o yüzden
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment()
            Navigation.findNavController(this,R.id.fragmentContainerView).navigate(action)
            println("menüye bastı")

        }
        return super.onOptionsItemSelected(item)
    }
}