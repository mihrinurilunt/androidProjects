package com.mihrinurilunt.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    //butona basınca ne yapılacağını burda id ile belirlicez normalde onClick metoduyla yapıyorduk
    // çünkü navigationda id daha kolay oluyor


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {  //!!
        super.onViewCreated(view, savedInstanceState)

        //In your onViewCreated method, you need to find the reference to the button using its ID.
        val button1 = view.findViewById<Button>(R.id.button1)  //!! burda farklı olarak view.find yapıyoruz

        //Once you have a reference to the button, you can set up a click listener to perform actions when the button is clicked:
        button1.setOnClickListener {
            // Code to run when button1 is clicked
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("mihrinur")
            Navigation.findNavController(it).navigate(action)


        }

    }
}