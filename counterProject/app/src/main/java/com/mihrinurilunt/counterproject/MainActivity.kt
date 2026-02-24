package com.mihrinurilunt.counterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*for (i in 6 downTo 0 step 2) {
            println(i)
        }*/

        /**Abstract Class**/
        //soyut sınıftan nesne oluşturmuyoruz sadece başka yerlrde uygulayarak kullanabiliyorsunz

        val textView = findViewById<TextView>(R.id.textView)
           object :CountDownTimer(15000,1000) {
            override fun onTick(p0: Long) {

                textView.text = "kalan:${p0 / 1000}"
            }

            override fun onFinish() {
                textView.text = "kalan:0"
            }
        }.start()

    }

    /*un counter(){
         for(y in 10 downTo 0){
             val textView=findViewById<TextView>(R.id.textView)
             textView.text=y.toString()
         }
     }*/

}