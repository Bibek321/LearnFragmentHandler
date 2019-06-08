package com.example.iteradmin.learnfragmenthandler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.Button

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.main_button)
        var i=0

        button.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransition=fragmentManager.beginTransaction()

            val secondFragment=SecondFragment()
            val firstFragment=MyFragment()

            if(i%2==0) {
                fragmentTransition.add(R.id.frag_one, secondFragment)
                fragmentTransition.addToBackStack(null)
                fragmentTransition.commit()
            }else{
                fragmentTransition.replace(R.id.frag_one,firstFragment)
                fragmentTransition.addToBackStack(null)
                fragmentTransition.commit()
            }
            i++
        }
    }
}
