package com.example.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationdrawer.databinding.FragmentDestino23Binding

class Destino23Fragment : Fragment() {
    private var _binding:FragmentDestino23Binding?=null
    private val binding get()=_binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentDestino23Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageButton2.setOnClickListener{findNavController().navigate(Destino23FragmentDirections.actionDestino23FragmentToNavPrincipal())}
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}