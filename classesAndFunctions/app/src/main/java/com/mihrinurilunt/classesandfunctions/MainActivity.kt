package com.mihrinurilunt.classesandfunctions

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sub(10, 20)     //yanında Unit yazıyor. Unit kotlin dilinde boş veya boşluk anlamına gelir
        //ve sonunda bir nesne döndürmeyeceinin göstergesidir bu.

        val textView2=findViewById<TextView>(R.id.textView2)
        var t = add(400, 30)
        println(t)
        textView2.text=t.toString()

        //butona tıkladığında textview'un yazısını değiştirecek
        //!! setOnClickListener basıldığında ne olacağını ayarla demek

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener{
            //buraya ne yazarsam yazayım sadece butona tıklandığında olacak
            val textView = findViewById(R.id.resultText) as TextView
            val resultOfAdd= add(10,60)
            textView.text="result: ${resultOfAdd}"
        }

        hero() //!! fonksyionuu çağırmalısın ki çalışsın:)
        nullGuvenligi()

    }

    fun firstFunction() {
        println("first function is clearly worked")
    } //böyle çalışmaz çünkü bir veya birden fazla çağırman lazım fonksiyonu



    /**input almak**/

    fun sub(x: Int, y: Int) {  //iki parametreli fonksiyon
        //var textView=findViewById<TextView>(R.id.textView) ///!!**
        //val str: String = textView.text.toString() //**

        val textView = findViewById(R.id.resultText) as TextView
        val a = x-y
        textView.text = "sonuç: ${a}"

    }

     //!! var a=sub(400,30) yapmamalıyız çünkü sub fonksiyonu değer döndürmüyor hata vermez ama logcatte
    // println(a) yaptığımızda çıktı da vermez. bu yüzden return kullanmalıyız

    /**Return (değer döndürmek)**/

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    /**button**/


    //butona tıkladığında textview'un yazısını değiştirecek

    /*
    fun change(view : View){  //bir view tarafından bunun çalıştırlacağını söyeleyecek (button)
        val textView = findViewById(R.id.textView) as TextView
        val resultOfAdd= add(10,60)
        textView.text="result: ${resultOfAdd}"
    }
     */ //bunun aynısını başka bir yöntemle de yapabiliriz


    /**classes**/

    fun hero(){

        /*var superman = SuperHero() //SuperHero sınıfından bir nesne oluştur
        superman.age=46
        superman.job="hero"
        superman.name="kevin"

        var batman =  SuperHero()
        batman.age=50
        batman.name="jhon"*/

        var superman=SuperHero("kevin",46,"hero")  //***constructor sayesinde bunu yapabiliyoruz

        var batman=SuperHero("jhon",50,"rich")

        val textView3 = findViewById(R.id.textView3) as TextView
        textView3.text="superman name: ${superman.name}"

        superman.testFonksyionu()

        superman.getColorOfHair()
    }

    fun nullGuvenligi(){
        //Null , Nullability ,Null Safety

        //Defining
        var myString : String?

        /*ikisi arasında yani initalize edilmeden önce stringimiz null. ve biz bazen varımıza değer atayp atamadığımızdan emin olamayabilirz
          serverdan veri çekerken mesela değer gelmeyebilirz ve sorun çıkar o yüzden benim bunları kontrol etmem lazım
          burda nullability(boş olabilme özelliği) den yararalnaıyoruz. yani bu ne demek yani bir değişkenin tipini
          değeri olacak ya da olmayacak şekilde tanımlyabilirm. bunu da sonuna ? koyarak yapıyoruz*/

        //Initialization
        myString = "Mihri"

        var myAge : Int? = null
        println(myAge)

        //println(myAge*2) hata verir yaşım şuan null bunu kontrol etmek ve hata vermesini engellemek için de null safetyi kullanıcaz

        //1
        if(myAge != null){
            println(myAge*2)
        }else{
            println("age is null. so operation is not worked")
        }

        //2

        // !! -> null olmayacak , ? -> null olabilir

        //println(myAge!!.minus(2)) -> myAge null olmasına ramen ben kesinlike myAge null olmayacak diyorum program çöküyor bu yüzden
        println(myAge?.minus(2)) //->çalışır

        //3 ******
        //elvis operatörü (yöntemin adı) --> ?:

        // myAge = 20
        val result = myAge?.minus(2) ?: 10
        println(result)

        /*!!!! eğer soru işaretinden önceki kısım null değilse onu print edecek. null ise 10 u print edecek
               yani age'i 20 olarak tanımlarsam 18(20-2) tanımlamazsam logcatte 10 gözükecek (10 burada default değer oluyor)*/

        //4
        //let

        myAge?.let{
            println(it * 5)
            /* 1.deki if bloğu gibi myAgein null olup olmadığını kontrol ediyor nullsa kod bloğunun
              içine girmiyor. null değilse bir değeri varsa onu(it) 5 ile çarpıp print ediyor */
        }
    }

}







