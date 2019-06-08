package com.example.iteradmin.learnfragmenthandler

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondFragment :Fragment(){
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView=inflater.inflate(R.layout.second_fragment
                ,container,false)
        val button=rootView.findViewById<Button>(R.id.frag_button)
        val txt=rootView.findViewById<TextView>(R.id.text)
        button.setOnClickListener{
            txt.text="a new text"
        }
        return rootView
    }
}