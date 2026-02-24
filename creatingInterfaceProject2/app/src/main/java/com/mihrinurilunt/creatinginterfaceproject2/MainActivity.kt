package com.mihrinurilunt.creatinginterfaceproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //yatay çevirme işlemi
    //AndroidManifest.xml dosyası içinde yapıyoruz ->
    // activity bloğunun içine gelip screenOrientation yazıp sensor'u seçiyoruz
    // sensor telefonun yatay mı dikey mi olduğunu algıla ve ona göre uygulamayı ayarla demek

    //bizim fotoğraflarımız aslında yatayda şu ançok güzel gözüküyor ama köt gözüktüğü durumlar da olabilir
    // ya da mesela yatayda daha büyük olduğu için bütün fotoları görmek isteyebiliriz o zaman yatay için ayrı design yapabilirz-->land\activity_maim.xml

}