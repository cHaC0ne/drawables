package com.example.drawable2.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.drawable2.R
import com.example.drawable2.databinding.FragmentFristBinding


class FristFrag : Fragment() {
    private var _b: FragmentFristBinding? = null
    private val b get() = _b!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _b = FragmentFristBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//    }
}