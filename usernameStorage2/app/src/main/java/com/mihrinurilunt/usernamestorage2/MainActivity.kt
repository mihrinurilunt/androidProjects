package com.mihrinurilunt.usernamestorage2

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //lateinit  var editText:EditText
    lateinit var textView:TextView

    lateinit var sharedPreferences : SharedPreferences  //!!* lateinit --> late initialize (değerini sonra vericem)

     var alinanKullaniciAdi : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* The error in the onCreate function is likely due to the textView variable not being initialized before you try to use it inside the if statement.
         When using lateinit properties, you need to ensure that they are initialized before accessing their values. Otherwise, you will get a lateinit property has not been initialized runtime error.
         To fix the issue, you can move the initialization of textView to before the if statement. */
        textView = findViewById(R.id.textView)  //!!

        //SharedPreferences
        //bu aslında bir xml yapısı szi bu yapıyı oluşturduğunuzda bu uygulamayı kullanan telefonda DataData klosörü içinde
        //bir xml dosyası oluşturuluyor. xml sadece kullanıcı ara yüzü oluşturmak için değil veriyi saklmak için de kullanılır
        //fakat bu ilkel bir yapı çok küçük veriler için kullanılır
        //If you have a relatively small collection of key-values that you'd like to save, you can use the SharedPreferences APIs.

           sharedPreferences= this.getSharedPreferences("com.mihrinurilunt.usernamestorage2",
            Context.MODE_PRIVATE)

        //kaydet fun içinde else'te veriyi kaydettik herhangi bir yere bunu geri almak istiyoruz burda put ile alıcaz

        alinanKullaniciAdi = sharedPreferences.getString("user","???")  //ikinci parametre user adı altında kaydedilen bir kullanıcı yoksa ne yapmamızı istediğinie dair

        if(alinanKullaniciAdi!=null){
           println("alinan kullanici adi null değil")
            textView.text="Kaydedilen Kullanıcı adı: ${alinanKullaniciAdi}"
        }

    }

    fun kaydet(view: View){
        var editText=findViewById<EditText>(R.id.editText)
        val userName=editText.text.toString()

        if (TextUtils.isEmpty(userName)){  //!!!username girilmiş mi diye kontrol ediyor
            Toast.makeText(this,"lütfen bir değer giriniz",Toast.LENGTH_LONG).show()
            println("ifin içine girdi")
        }else {
            textView=findViewById(R.id.textView)
            sharedPreferences.edit().putString("user",userName).apply() //the username is saved in SharedPreferences, and the "textView" is updated to display the saved username.
            textView.text = "Kaydedilen Kullanıcı Adı: ${userName}"
        }

        //sharedPreferences
    }

    fun sil(view:View){

        alinanKullaniciAdi = sharedPreferences.getString("user","???")
        textView=findViewById(R.id.textView)
        textView.text = "Kaydedilen Kullanıcı Adı:"
        //önce silinecek bir değer var mı diye kontrol ediyoruz
        if(alinanKullaniciAdi!=null){
            sharedPreferences.edit().remove("user").apply()
        }
    }
}