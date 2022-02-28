package com.example.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navegacion.databinding.FragmentYellowBinding
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

        binding.buttonyellow.setOnClickListener {
            Snackbar.make(binding.root,"CAMBIANDO DE FRAGMENT",Snackbar.LENGTH_SHORT).show()
            findNavController().navigate(YellowFragmentDirections.actionYellowFragmentToGreenFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}