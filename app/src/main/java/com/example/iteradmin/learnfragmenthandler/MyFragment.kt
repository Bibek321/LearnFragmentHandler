package com.example.iteradmin.learnfragmenthandler

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.*

class MyFragment :Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView=inflater.inflate(R.layout.my_fragment,container,false)
        val button=rootView.findViewById<Button>(R.id.frag_btton)
        button.setOnClickListener{
            Toast.makeText(context,"Worked",Toast.LENGTH_LONG).show()
        }
        return rootView
    }
}