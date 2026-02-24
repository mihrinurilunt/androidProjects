package com.mihrinurilunt.differentactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    lateinit var  button : Button // btn_save Button oldugunu atadık
    //lateinit var userInput : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Layout id'leri ile eşleştirme yaptık
        button=findViewById(R.id.button)

        println("onCreate çağırıldı")

    }

    override fun onStart() {
        super.onStart()

        println("onStart çağırıldı")

    }

    /*!!! onCreate uygulama ilk çalıştırıldığı anda çalışır. mesela ikinci sayfaya geçtik ve ilk sayfaya geri döndük
          geri döndüğümüzde oncreate değil onStart ve onResume çalıştırılır/ çağırılır. Bu yüzden ekran her açıldığında
          bir şey yapmam geregiyorsa mesela bunu onCreate altına değil onStart ve ya onResume altına yazmam gerekir */

    override fun onResume() {
        super.onResume()

        println("onResume çağırıldı")

    }

    override fun onPause() {
        super.onPause()

        println("onPause çağırıldı")

    }

    override fun onStop() {
        super.onStop()

        println("onStop çağırıldı")

    }

    override fun onDestroy() {
        super.onDestroy()

        println("onDestroy çağırıldı")

    }


    /*Button’a basınca ne yapılmasını ıstedıgını yazalım
        sizin EditText ‘ e gireceginiz datayı diger sayfada tanımlamasını istiyorum*/


    //context genel olarak içinde bulunduğumuz durumdur
    // ve bu durumu yani aktivitenin genel durumunu takip edebilmek için oluşturulmuş bazı context yapıları mevcut

    fun changeActivity(view: View){
        var userInput = findViewById<EditText>(R.id.editText).text.toString()

        val intent = Intent(this, secondActivity::class.java)
        intent.putExtra("yollananVeri",userInput)
        //ikinci sayfayı başlatmadan önce (startActivity) veriyi koyabiliriz(putExtra !) ya da veriyi alabiliriz mesela
        //!!!! burdan veriyi koyduk(putExtra) diğer taraftan da ikinci sayfadan yani veriyi almalıyız!
        startActivity(intent)
        finish()
    }

    /**Activity LifeCycle**/
    //aktivitelerin yaşam döngüsü vardır aktiviteler oluşturulduktan sonra kapanabilir(destroy edilebilir) ve yerini başka aktivitelere bırakabilirler

    //** aktiviteleri geçerken geri dönmek istemiyorsanız o aktiviteyi kapatmalısın(destroy) böylece hafıza yönetimi daha iyi olur
    // en güzel örnei  mesela login ativitesi kullanıcı adını giriyor şifresini giriyor logine tıklayıp içeri giriş yapıyor
    /// bir daha o aktiviteye geri dönmemesi lazım geri tuşuna bastığında bu yüzden onu kapatmamız lazım -->finish()

}


