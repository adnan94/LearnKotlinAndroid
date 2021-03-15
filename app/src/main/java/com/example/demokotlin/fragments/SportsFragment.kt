package com.example.demokotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.demokotlin.R
import com.example.demokotlin.databinding.FragmentSportBinding

class SportsFragment : Fragment() {

    lateinit var binding:FragmentSportBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sport, container, false)
        binding.label.text = arguments!!.getString("title","")
        return binding.root
    }
}// Required empty public constructor