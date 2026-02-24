package com.mihrinurilunt.yemektariflerisqlite

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat

class TarifFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tarif, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener{
            kaydet(it)   //buttona tıklanınca kaydet fonksiyonunu çalıştır
        }

        val imageView = view.findViewById<ImageView>(R.id.imageView)
        imageView.setOnClickListener{
            gorselSec(it)
        }
    }
    fun kaydet(view:View){
        //SQLite'a Kaydetme
    }

    fun gorselSec(view: View){
        //gorsel seçmek için kullanıcın iznini almamız lazım-->permissions
        //izin almak için kullanıcın hardriverına gidicez görsellerini kaydettiği yer

        activity?.let {
            if (ContextCompat.checkSelfPermission(
                    it.applicationContext,
                    Manifest.permission.
                ) != PackageManager.PERMISSION_GRANTED
            )
        }
    }

}

//basit ve çok yaygın izinleri manifeste yazıp geçiyoruz. mesela internet izni internet kullanmyan uygulama nerdeyse yok bunu ayrıca kullanıcıya sormamıza gerek yok
// manifeste yazıp geçiyoruz. ama mesela kamera erişimi galeriye erişim mikrofon erişimi gib şeyler için açık açık izin almamız lazım
//bunu android developers da permission level ile anlayabiliriz permission level normalse manifeste yaz geç dangeroussa kullanıcıya açık açık sor