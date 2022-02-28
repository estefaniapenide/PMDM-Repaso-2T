package com.example.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navegacion.databinding.FragmentGreenBinding
import com.google.android.material.snackbar.Snackbar


class GreenFragment : Fragment() {

    private var _binding:FragmentGreenBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentGreenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGreen.setOnClickListener {
            Snackbar.make(binding.root,"CAMBIANDO DE FRAGMENT",Snackbar.LENGTH_SHORT).show()
            findNavController().navigate(GreenFragmentDirections.actionGreenFragmentToYellowFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}