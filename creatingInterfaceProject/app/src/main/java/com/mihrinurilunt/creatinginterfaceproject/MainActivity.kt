package com.mihrinurilunt.creatinginterfaceproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /* imageView'da layout_width ve layout_height'ta  *wrap_content* seçeneği --> içerik ne kadarsa
       o kadarını göster demek biz bunu textVielarda çok kullanıyoruz. çünkü mesela kullanıcı çok
       uzun bir input girebilir bu sayede hepsiini göstermiş oluruz.*/

    /* dp --> Density-independent pixels. Ekranın fiziksel yoğunluğuna bağlı bir birimdir ve bağımsızdır.
              Ortalama her ekranda aynı boyutta gözükür. -> kendini farklı ekran boyutlarına göre ayarlayabilen bir yapı */

    //GridLayout!! --> ızgara görünümü
}