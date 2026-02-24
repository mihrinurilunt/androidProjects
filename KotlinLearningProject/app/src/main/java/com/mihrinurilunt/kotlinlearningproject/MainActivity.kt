package com.mihrinurilunt.kotlinlearningproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //!! println() --> print line yani satırı yazdır demek
        println("hello kotlin")
        println(5 * 10)

        /***Değişkenler (variables)***/

        var a=3.14
        var b=10
        println(a*b)

        var age=50 //değişken tanımlaması
        age=60     //değişken değiştirme
        println(age)

        /***Sabitler (values)***/

        val x=10
        // x=4 yapamazsın!! var'daki gibi
        //val pi=3.14

        val ageResult=age * x
        println(ageResult)

        /***Integer***/

        //Define(tanımlama)
        val myInteger : Int //myInteger diye bir değişken tanımlıyorum ve bunun veri tipi integer olacak demek

        //Initializing(başlatma,değerini atama)
        myInteger=15
        println(myInteger)

        println(myInteger/2)  //!! 7.5 yazdırması gerekirken Logcat'te 7 yazıyor çünkü myInteger 15
                                // yani bir integer ve 2 de bir integer bu yüzden android studio
                                // iki integerın bölümü inetegr olmalı diyor ve 7 çıktısı veriyor.

        /***Long***/

        var myLong : Long = 100  //100 normalde bir integer ama eğer bu değişkene ilerde çok büyük bir değer atayacaksak
                                //bunu en baştan long diye tanımlamalıyız
        myLong=3000000000000
        println(myLong)

        /***Double & Float***/

        //default'u double

        val pi=3.14 //(double)
        println(pi*2)

        val floatPi : Float = 3.14f //float diye tanımlıyorsan sonuna f koyman lazım

        val myDouble=15.0
        println(myDouble/2)

        /***String***/

        val myString="my new string"
        println(myString.length) //!!

        val name = "mihrinur"
        val surname = "ilunt"
        val fullName = name + " " + surname  //!!!
        println(fullName)

        val m : String
        m = "10"
        val n : String
        n = "20"
        println(m+n) //1020 tabiki çıktı 30 değil

        /***Boolean***/

        var myBoolean = true
        //!!
        println(3<5) //outputu true olacak
        println(4!=4) //false

        /***Veri tiplerini dönüştürme***/

        val myInt = 10
        val longaCevrilenInt = myInt.toLong()

        // kulanıcıdan biz verileri string olarak alırız bunununla ne yapacağımız bize kalır
        //***
        val userInput = "50"  //eğer bir text girilseydi tabiki integer'a çeviremeyiz ve uygulama hata verir
        val userInt = userInput.toInt()
        println(userInt/2)

        /***Array***/

        //birden fazla veri ve veri tipi tutulabilir

        //*****
        var stringEx = "mihri"
        val myArray = arrayOf(stringEx,"ege","ahmet","cemile","ayşe")
        println(myArray[0])
        println(myArray.get(1))   //!!
        println(myArray.size)
        myArray[4]="buse"  //array elemanını değiştirme
        println(myArray.get(4))
        myArray.set(2,"love")    //!!
        println(myArray[2])

        val numberArray = intArrayOf(1,2,3)
        println(numberArray.get(2))

        val mixArray = arrayOf("mihri",20,"sakarya üni",1.63,true)
        println(mixArray[2])
        mixArray[4]="zeynep"
        println(mixArray[4])

        /***ArrayList***/

        // arrayList ve arrayler arasındaki fark arrayListlerin biraz daha esnek olmasından kaynaklanıyor
        //listelerde örneğin sonradan ekleme yapmak istenildğinde daha kolay işlem yapabiliyoruz

        // val nameList = arrayListOf() --> hata verir
        // val nameList = arrayListOf<string>() -->hata vermez
        // val nameList = arrayListOf("mihri","ege") -->hata vermez
        //kısaca listelerde ya içine bir değer yazmak lazım ya da hangi veri tipinde olduğunu belirtmek lazım

        /*!add!*/
        val nameList = arrayListOf("mihri","ege","ahmet")
        println(nameList[1])
        nameList.add(1,"ayşe")
        println(nameList[1])
        nameList.add("buse")
        println(nameList[4])
        //val nameList: ArrayList<String> şu an arrayim böyle ve int ekleyemiyorum eğer int eklemek istiyorsan <Any> kullanman lazım

        val list= arrayListOf<Any>("mihri",20,"sakarya üni",1.63,true)
        list.add(58)
        println(list[5])

        val list2 = ArrayList<Int>() //başka bir gösterim
        list2.add(10)
        list2.add(60)
        println(list2[1])

        /***Set***/
        //set de bir koleksiyon içinde birden fazla veriyi barındırabildiğimiz bir yapı fakat aynı veriden sadece bir tane barındırıyor
        // yani arrayde mesela üç tane 6 beş tane mehmet barndırabilirsin ama set de sadece bir tane 6 ve bir tane mehmet barındırabilirsin

        val arrayEx = arrayOf("mehmet",6,6,6,"mehmet",45)
        println("index 2: ${arrayEx[2]}")  /**!!!!!!*/ // bir metin içinde kod çalıştırmak istiyorsa $ işareti koyuyorsun
        println(arrayEx.size)

        val mySet = setOf("mehmet",6,6,6,"mehmet",45)
        println(mySet.size)  //!6 değil 3 çıktı verir (mehmet,6,45)

        //set'te set[0] falan yapamıyoruz o zaman elemanları nasıl çıktı alıcaz -->for each ile

        mySet.forEach {
            println(it)
        }
        val intSet = setOf<Int>()
        val set=HashSet<String>()
        set.add("miri")
        set.add("ege")

        /**Map**/
        // Key-Value pairing yapıyoruz (yani anahtar kelime - değer eşleştirmesi)

        /* mesela bir diyet programı yapıyoruz yemeklerle kalorileri eşleştiricez bunu önceki bilgilerimizle
           arrayle yaabilirz */

        val yemekler = arrayOf("elma","et","tavuk")
        val kaloriler = intArrayOf(100,300,200)  //indexleri eşitleriz
        println("${yemekler[0]}'nın kalorisi: ${kaloriler[0]}")
        //peki ya çok fazla veri varsa ya da kaç veri olduğunu bile bilmyorsam veriyi internetten çekiyorsam?
        // ya çekerken birin ismi gelse kalorisi gelmese öyle karışsa birçok sorun olabilir.
        //bu yüzden böyle yapacağıma bribiryle eşleşmişş halini yaprım işte burda hash map devreye giriyor.

        val kaloriMap = hashMapOf<String,Int>()  //(key ->string (elma,et..) , value -> int (100,300)
        kaloriMap.put("elma",100) //!!put kullanıyoruz add değil
        kaloriMap.put("et",300)
        println(kaloriMap.get("elma"))

        val studentsMap = hashMapOf<Int,String>()
        studentsMap.put(22,"feza")
        studentsMap.put(35,"sevval")
        studentsMap.put(48,"miri")
        println(studentsMap.get(35))

        /**Math Operations**/

        var number = 8
        println(number)
        number=number+1
        println(number)
        number++
        println(number)
        number--
        println(number)

        var number2=10
        println(number2>number)
        println(number2>number && 2>3)
        println(number2>number || 2>3)

        //Remainder - Kalanı bulmak
        println(100%3)

        /**If Statements**/

        val skor = 10
        if(skor<10) {
            println("gg")
        } else if(skor>=10 && skor<20){
            println("ok u pass")
        } else if(skor>=20 && skor<30){
            println("nice!")
        } else{
            println("wow greate job")
        }

        /**When**/ //!!!!
        //şu olduğu zaman bunu yap bu olduğu zaman bunu yap, şu koşul tutarsa bunu yap
        //!! else ifler çok olduğu zaman bunu kullanıyoruz

        var not = 3
        var mesaj = ""

        /* bu çok karışık oluyor
        if(not==0){
            mesaj=="geçersiz not"
        }else if(not==1) {
            mesaj == "zayıf"
        }else if(not==2) {
            mesaj == "kötü"
        }else if(not==3) {
            mesaj == "orta"
        }else if(not==4) {
            mesaj == "iyi"
        }else{
            mesaj == "pek iyi"
        }
        println(mesaj)
        */

        when(not){
            0 -> mesaj = "geçersiz not"
            1 -> mesaj = "zayıf"
            2 -> mesaj = "kötü"
            3 -> mesaj = "orta"
            4 -> mesaj = "iyi"
            else -> mesaj = "pek iyi"
        }
        println(mesaj)

        /***For Loop***/

        var j=0
        val array= arrayOf(5,10,15,20,25,30)
        for(num in array){
            //println(num) //!!
            println(num/5+3)
            /* println("${j}. eleman:${num}")
            j++ */ //index alma için başka yöntem
        }
         //indexleri almamız için gösterim
         for(i in array.indices){
            println("${i}. eleman:${array[i]}")
        }

        for(y in 0..9) { //!!range 0-9 --> 0..9
            println(y)
        }

        val stringArray= ArrayList<String>()
        stringArray.add("mihri")
        stringArray.add("ilunt")

        for(str in stringArray){
            println(str)
        }
        stringArray.forEach {
            println(it)  //***
        }

        /***while***/

        var k=0
        while(k<10){
            println(k)
            k++
        }
    }
}

//Logcat--> yazdığımız kodların çıktıların,sistem mesajlarını görebildeceiğimiz bir sistem

// camelCase --> yasSonucu
// snake_case --> yas_sonucu