package com.example.roughwork.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

import com.example.roughwork.R

class MensClothsFragment : Fragment() {

    var button:Button?=null
    var views :View?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        views= inflater.inflate(R.layout.fragment_mens, container, false)

        button=views?.findViewById(R.id.button)

        button?.setOnClickListener{
            Toast.makeText(context,"update recycler View",Toast.LENGTH_SHORT).show()
        }

        return views
    }
}
