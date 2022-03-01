package com.example.navigationdrawer

import android.os.Bundle
import android.view.*
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

    override fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        requireActivity().menuInflater.inflate(R.menu.menufotos, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemfoto1->{findNavController().navigate(Destino2FragmentDirections.actionNavDest2ToDestino21Fragment())}
            R.id.itemfoto2->{findNavController().navigate(Destino2FragmentDirections.actionNavDest2ToDestino22Fragment())}
            R.id.itemfoto3->{findNavController().navigate(Destino2FragmentDirections.actionNavDest2ToDestino23Fragment())}
        }
        return super.onContextItemSelected(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}