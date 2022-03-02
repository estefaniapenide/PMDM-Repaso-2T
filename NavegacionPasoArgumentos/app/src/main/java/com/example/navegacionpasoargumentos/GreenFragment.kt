package com.example.navegacionpasoargumentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navegacionpasoargumentos.databinding.FragmentGreenBinding

class GreenFragment : Fragment() {

    private var _binding:FragmentGreenBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentGreenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Si no le hubiera puesto un valor por defecto en el argumento esto no lo dejaría hacer
        binding.buttongreen.setOnClickListener { findNavController().navigate(GreenFragmentDirections.actionGreenFragmentToYellowFragment()) }

        binding.buttonpasainfo.setOnClickListener {
            binding.editTextNumber.text.toString().toIntOrNull()?.let{
                findNavController().navigate(GreenFragmentDirections.actionGreenFragmentToYellowFragment(it))
            }?: Toast.makeText(activity, "Debe introducir un número", Toast.LENGTH_SHORT).show()

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}