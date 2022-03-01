package com.example.navigationdrawer

import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationdrawer.databinding.FragmentDestino2Binding


class Destino2Fragment : Fragment() {

    private var _binding: FragmentDestino2Binding? = null
    private val binding get() = _binding!!

    private fun clicNormal(){
        Toast.makeText(activity,"Mantén más tiempo pulsado",Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentDestino2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvFotos.setOnClickListener { clicNormal() }
        registerForContextMenu(binding.tvFotos)

        binding.button4.setOnClickListener { findNavController().navigate(Destino2FragmentDirections.actionNavDest2ToDestino21Fragment()) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}