package com.example.navigationdrawermanual

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navigationdrawermanual.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navHostFragment:NavHostFragment
    private lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.content.toolbar)

        val toggle= ActionBarDrawerToggle(this,binding.drawer,binding.content.toolbar,R.string.abrir,R.string.cerrar)


        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()

        navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController= navHostFragment.navController

        //Si se llama igual a los items y los fragments se puede usar esto, pero no permite usar convinado con e setNavigationItemSelectedListener
        binding.navView.setupWithNavController(navController)

        /*binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_ajustes->{accion()}
                R.id.nav_contactos->{accion()}
                R.id.nav_inicio->{accion()}
            }
            true
        }*/
    }

    private fun accion(){
        navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController= navHostFragment.navController
        binding.navView.setupWithNavController(navController)
        binding.drawer.closeDrawer(GravityCompat.START)
    }

   /* private fun accion(int:Int){
        accion(getString(int))
    }*/
}