package com.mihrinurilunt.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation

class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {  //!!
        super.onViewCreated(view, savedInstanceState)

        // Firstfragmenttan veri gönderilmiş mi diye kontrol edip gönderdiğimiz veriyi alıyoruz
        arguments?.let {
            val username=SecondFragmentArgs.fromBundle(it).username
            val textView2 = view.findViewById<TextView>(R.id.textView2)
            textView2.text=username
            println(username)
        }

        //In your onViewCreated method, you need to find the reference to the button using its ID.
        val button2 = view.findViewById<Button>(R.id.button2)  //!! burda farklı olarak view.find yapıyoruz

        //Once you have a reference to the button, you can set up a click listener to perform actions when the button is clicked:
        button2.setOnClickListener {
            // Code to run when button2 is clicked
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)

        }
    }
}