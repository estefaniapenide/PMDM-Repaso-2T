package com.example.navegacionpasoargumentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navegacionpasoargumentos.databinding.FragmentYellowBinding
import com.google.android.material.snackbar.Snackbar

class YellowFragment : Fragment() {
    private var _binding:FragmentYellowBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentYellowBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var numero = YellowFragmentArgs.fromBundle(requireArguments()).numberGreenToYellow
        Snackbar.make(binding.root,"Número: $numero",Snackbar.LENGTH_SHORT).show()
        binding.textViewRecibido.text=numero.toString()

        binding.buttonyellow.setOnClickListener { findNavController().navigate(YellowFragmentDirections.actionYellowFragmentToGreenFragment()) }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}