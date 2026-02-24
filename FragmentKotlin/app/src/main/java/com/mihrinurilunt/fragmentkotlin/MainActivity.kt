package com.mihrinurilunt.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goFirstFragment(view: View){

        //fragmentları kullanabilmek için fragman yöneticisi diye bir yapıyı çağırmamız gerekiyor -->fragmentManager

        val fragmentManager = supportFragmentManager
        // yapacağımı işlemleri başlatmak için transaction diye bir yapı oluşturuyoruz
        val fragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = BlankFragment()
        //fragmentTransaction.add(R.id.frameLayout,firstFragment).commit()  //add olunca birinci fragmentla ikinci fragmenttaki yazılar üst üste geliyo o yüzden replace kullanmalıyız ki önceden bir yazı varsa değiştirsin
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()

    }

    fun goSecondFragment(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = BlankFragment2()
        //fragmentTransaction.add(R.id.frameLayout,secondFragment).commit()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()
    }

}

//Fragments aslında bir kullanıcı arayüzü. aktivitelerle beraber aktivitelerden daha iyi bazı arayüzler tasarlamak için br yapı
//tek bir aktivitenin içinde birden fazla fragment kullanabiliyoruz.
// !! o sebeple aktiviteyi açmadan kapamadan başka bir aktiviteye geçmeden ekranı değiştirebiliyoruz aslında