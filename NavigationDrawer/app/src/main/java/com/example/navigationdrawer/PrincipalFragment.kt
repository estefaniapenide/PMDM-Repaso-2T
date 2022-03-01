package com.example.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationdrawer.databinding.FragmentPrincipalBinding

class PrincipalFragment : Fragment() {

    private var _binding:FragmentPrincipalBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentPrincipalBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener { findNavController().navigate(PrincipalFragmentDirections.actionPrincipalFragmentToNavDest1()) }
        binding.button2.setOnClickListener { findNavController().navigate(PrincipalFragmentDirections.actionPrincipalFragmentToNavDest2()) }
        binding.button3.setOnClickListener { findNavController().navigate(PrincipalFragmentDirections.actionPrincipalFragmentToNavDest3()) }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}