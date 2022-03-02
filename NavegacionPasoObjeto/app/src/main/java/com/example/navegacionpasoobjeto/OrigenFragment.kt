package com.example.navegacionpasoobjeto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navegacionpasoobjeto.databinding.FragmentOrigenBinding


class OrigenFragment : Fragment() {
    private var _binding:FragmentOrigenBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       _binding= FragmentOrigenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {


            val nombre=binding.editTextTextPersonName.text.toString()
            val apellidos=binding.editTextTextPersonName2.text.toString()
            //val edad=binding.editTextNumber.text.toString()?.toIntOrNull()?:0
            val mail=binding.editTextTextEmailAddress.text.toString()

            binding.editTextNumber.text.toString().toIntOrNull()?.let{//Apaño malo para que no rompa si no mete la edad
                val persona = Persona(nombre, apellidos, it, mail)
                findNavController().navigate(OrigenFragmentDirections.actionOrigenFragmentToDestinoFragment(persona))
            }?: Toast.makeText(activity, "Como mínimo debe introducir la edad", Toast.LENGTH_SHORT).show()

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }


}