//bir tane buton koyucaz butona basınca uyarı mesajı vericek
//mesela şifre girmeden butona basarsınız ve size uyarı mesajı verir şifre girmediniz diye

package com.mihrinurilunt.contextproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast, Alert mesajı

        //applicationContext -> appin kendi contexti
        //this , this@MainActivity --> activity nin contexti

        Toast.makeText(this,"Hoşgeldin!",Toast.LENGTH_LONG).show()  //length_long mesajın uzun duracağını gösterir
    }

    fun showMessage(view: View){

        val warningMessage = AlertDialog.Builder(this)
        warningMessage.setTitle("şifre hatası")
        warningMessage.setMessage("şifreyi girmediniz, baştan denemek ister misiniz?")

        //Lambda gösterimi
        //listener demek siz bir işlem yaptığınızda sonucunu size bildiren ve ona göre aksiyon almanızı sağlayan yapılardır
        //örneğin kullanıcı evete bastı mı basarsa ne yapyım onu dinliyor. burda lambda gösteriminde yararlanıyoruz

        warningMessage.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"eveti seçtiniz yeniden deneyebilirsiniz",Toast.LENGTH_LONG).show()
        })
        warningMessage.setNegativeButton("hayır",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"hayırı seçtiniz",Toast.LENGTH_LONG).show()
        })
        warningMessage.show()  //!!
    }
}