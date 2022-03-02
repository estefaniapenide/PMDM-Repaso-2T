package com.example.navegacionpasoargumentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.navegacionpasoargumentos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration:AppBarConfiguration
    private lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setSupportActionBar(binding.toolbar)

        var navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController= navHostFragment.navController

        //Personalizando la toolbar para que salgan los labels del fragment
        appBarConfiguration = AppBarConfiguration(setOf(R.id.greenFragment, R.id.yellowFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.button.setOnClickListener {
            when(navController.currentDestination?.id){
                R.id.yellowFragment->{navController.navigate(YellowFragmentDirections.actionYellowFragmentToGreenFragment())}
                //Si no le hubiera puesto un valor por defecto en el argumento esto no lo dejaría hacer
                R.id.greenFragment->{navController.navigate(GreenFragmentDirections.actionGreenFragmentToYellowFragment())}
                else -> throw Exception("No hay acción asignada")
            }

        }

    }
}