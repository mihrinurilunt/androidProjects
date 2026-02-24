package com.mihrinurilunt.navigationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}

//navigation -> build and structure your in-app UI, handle deep links, and navigate between screens.

/** fragmmentlar arası veri aktarmak istiyoruz mesela birinci fragmenttan ikinci fragmenta kullanıcının adını yaşını falan göndericez
    o zaman ikinci framentta **argument** oluşturmamız gerekiyor
 * **/

//Safe Args is a Gradle plugin that generates classes for navigating between destinations in the Navigation component.
// These generated classes help you safely pass arguments and navigate between different parts of your app.