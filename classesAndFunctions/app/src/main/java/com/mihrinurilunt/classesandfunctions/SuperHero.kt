package com.mihrinurilunt.classesandfunctions

class SuperHero(var name: String, var age: Int, var job: String ) {  //sayfadaki tüm kodları tek satırda yapmış olduk
                                                                      //bu özellik kotlinde varmış ve primary constructor diye geçiyor
    /*
    //property

    var name=""
    var age=0
    var job=""

    /**Constructor**/

    //inşa etmek ve yapıyı oluşturmak manasına geliyor
    //sınıftan bir nesne oluşturduğunuz zaman çağırılan bir fonksiyondur

    constructor(name: String, ageInput: Int, jobInput: String){
        //name=nameInput
        this.name=name
        age=ageInput
        job=jobInput

        println("cunstructor is worked")
    }
    */

    fun testFonksyionu(){
        println("test")
    }

    /**Access Levels - Erişilebilirlik Seviyeleri**/
    //private - protected - internal - public

    //private fonksiyona sadece aynı class içinde ulaşabilirsin
    // public fonksiyona aynı class içinde ve *aynı dosyadaki başka bir class*tan ulaşabailirsin
    //internal sadece kendi module'lerimiz içinden ulaşılbilir demek


    private var colorOfHair = "yellow"   //!!!**** public yaparsak mainActivity'de hem saçın rengine ulaşabiliyoruz hem de print edebiliyoruz
                                         // eğer sadece variable'ımıza ulaşılmasını ama değiştirilmesini istemiyorsak private tanımlayıp
                                         // bir fonksiyon oluşturup mainActivity'de ona ulaşım sağlayabiliriz!!

    //getter
    fun getColorOfHair() : String{
        return this.colorOfHair
    }

    //setter
    fun setColorOfHair() {
        this.colorOfHair = "green"
    }       // mesela saçın renginin diğer kullanıcılar tarafından sadece yeşile çevirilebilmesini istiyorum böyle bir şey yapabilirim.


}