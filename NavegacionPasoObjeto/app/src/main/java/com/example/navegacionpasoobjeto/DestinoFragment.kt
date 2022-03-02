package com.example.navegacionpasoobjeto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navegacionpasoobjeto.databinding.FragmentDestinoBinding

class DestinoFragment : Fragment() {
    private var _binding: FragmentDestinoBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentDestinoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val persona = DestinoFragmentArgs.fromBundle(requireArguments()).datos
        binding.textViewNombre.text=persona.nombre
        binding.textViewApellidos.text=persona.apellidos
        binding.textViewEdad.text=persona.edad.toString()
        binding.textViewEmail.text=persona.email

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}