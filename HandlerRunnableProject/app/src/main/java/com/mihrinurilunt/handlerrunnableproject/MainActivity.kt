//saniyede bir işlem yapmak istiyorum ve belli bir periyodu yok mesela
//ne zaman durduracağına kullanıcı kendisi karar verecek

/*this code sets up a simple counter that starts when the "start" button is clicked and updates the value every second on a TextView.
 The counter will continue to run until stopped or until the activity is destroyed.*/

package com.mihrinurilunt.handlerrunnableproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num = 0
    var runnable:Runnable= Runnable {  }
    var handler = Handler(Looper.getMainLooper())
    //handlerı runnable'ı kullanbilmk için kullanıyoruz
    /*The error is because you need to provide a Looper instance to the Handler constructor when creating it.
     The Looper is responsible for managing the message queue for the thread in which the Handler is running.
     In Android, the main thread (also called the UI thread) has a Looper by default, so you can use
      Handler(Looper.getMainLooper()) to create a Handler that runs on the main thread. */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(view : View) {
        var textView=findViewById<TextView>(R.id.textView)

        /*!!
        while(num<100){
            num++
            textView.text=num.toString()
            //işletim sistemi çok hızlı olduğu için direkt 0dan 100e gidiyor adımları göremiyoruz

            /**Threading**/
            // genelde threadingi aynı anda işlemciye birden fazla farklı proccessleri execute ettirmek için kullanırız

            Thread.sleep(1000)
            //ama böyle yapınca sistem donuyor ve hata veriyor
            //bu olmasın diye runnable kullanıyoruz!!

        }*/

        runnable = object : Runnable{
            override fun run() {    //2-->> runnable da kendi içerisinde devamlı çalışacak bu satırı çalıştırıyor
                num++
                textView.text = "counter: ${num}"
                handler.postDelayed(runnable,1000)  //delay rötar demek kaç saniye rötarlı çalışacağını yazıcaz

            }
        }
        handler.post(runnable)  //bu satır runnable'ımı çalıştırıyor 1-->>


    }

    fun finish(view : View){
        handler.removeCallbacks(runnable)

    }
}

/* This is an anonymous inner class that implements the Runnable interface. The run method increments the num variable,
updates the textView to display the current value of num, and posts the Runnable to the Handler with a delay of 1000 milliseconds (1 second).
This creates a loop that will execute the run method every second to update the counter.

handler.post(runnable): This line posts the Runnable to the Handler, starting the counter loop.*/