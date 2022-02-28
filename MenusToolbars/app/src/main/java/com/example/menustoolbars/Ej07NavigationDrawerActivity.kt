package com.example.menustoolbars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.menustoolbars.databinding.ActivityEj07NavigationDrawerBinding
import com.google.android.material.snackbar.Snackbar

class Ej07NavigationDrawerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj07NavigationDrawerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityEj07NavigationDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.content07.toolbar3)
        supportActionBar!!.title="EJERCICIO 7"
        supportActionBar!!.subtitle="Navigation Drawer"

        val toggle=ActionBarDrawerToggle(this,binding.drawer,binding.content07.toolbar3,R.string.abrir,R.string.cerrar)

        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.iteminicio->{cambio(R.string.inicio)}
                R.id.itemcontactos->{cambio(R.string.contactos)}
                R.id.itemajustes->{cambio(R.string.ajustes)}
            }
            true
        }

    }

    private fun cambio(s:String){
        binding.drawer.closeDrawer(GravityCompat.START)
        Snackbar.make(binding.root,s,Snackbar.LENGTH_SHORT).show()
        supportActionBar!!.title=s
    }

    private fun cambio(int:Int){
        cambio(getString(int))
    }




}