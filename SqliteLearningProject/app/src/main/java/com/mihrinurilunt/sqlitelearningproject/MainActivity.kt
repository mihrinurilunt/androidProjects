package com.mihrinurilunt.sqlitelearningproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //try catch --> hata verecek durumlarda çok kullanışlı

        /*mesela hata alma ihtimalim olan bir kod yazıcam ama programımın çökmesini de istemiyorum
          o zaman tüm kodu try kod bloğu içinde yazıyorum hata almazsam zaten çalışır hata alırsam da
          catch kod bloğu hatayı yakalıyor sonrasında istersek kullanıcıya hata mesajı veririz istersek de logcate yazdırız.*/

        try{

            val database = this.openOrCreateDatabase("Products", MODE_PRIVATE,null) //ya veritabanını oluşturacak ya da halihazırda varsa onu açacak
            database.execSQL("CREATE TABLE IF NOT EXISTS products(id INTEGER PRIMARY KEY,name VARCHAR,price INTEGER)") //!!create table
            //database.execSQL("INSERT INTO products(name,price) VALUES('shoes',2000)")
            /*database.execSQL("INSERT INTO products(name,price) VALUES('shirt',300)")
            database.execSQL("INSERT INTO products(name,price) VALUES('hat',50)")
            database.execSQL("INSERT INTO products(name,price) VALUES('skirt',250)")
            database.execSQL("INSERT INTO products(name,price) VALUES('pants',400)")*/

            //database.execSQL("DELETE FROM products WHERE id=5") veri silme
            database.execSQL("UPDATE products SET price=100 WHERE name='hat'")

            val cursor = database.rawQuery("SELECT * FROM products",null)   //cursor(imleç\gösterge) ->verileri tek tek geziyo okuyo ve bize söylüyo
            //val cursor = database.rawQuery("SELECT * FROM products WHERE name='skirt'",null)
            //val cursor = database.rawQuery("SELECT * FROM products WHERE name LIKE 'p%'",null) //A ile başlayanları getir

            val idColumnIndex = cursor.getColumnIndex("id")
            val nameColumnIndex = cursor.getColumnIndex("name")
            val priceColumnIndex = cursor.getColumnIndex("price")

            while(cursor.moveToNext()){   //! hareket edebildiği yere kadar bir sonraki veri olduğu sürece okuma işlemini yap
                println("ID: ${cursor.getInt(idColumnIndex)}")
                println("Name: ${cursor.getString(nameColumnIndex)}")
                println("price: ${cursor.getInt(priceColumnIndex)}")
            }

            cursor.close()

        }catch(e:Exception){
            e.printStackTrace()    //bütün hataları loga yazdırır
        }


    }
}

//sql->structured query language
//query ->veri tabanıyla iletşime geçerken kullandığımız sorgular
//!! sqlite androidin kullandığı ve telefonun içinde lokal olarak saklanan bir veri tabanı
// veriler serverda(sunucuda salnamıyor) yani yapaacağımız işlemler herkesin kendi telefonunda saklanıyor!!
//!! kullanıcın kendi istediği verileri sakladığı ve sonrasında tekrar kullanbildiği bir yapı not uygulaması gibi