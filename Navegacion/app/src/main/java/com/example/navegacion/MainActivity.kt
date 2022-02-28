package com.example.navegacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.navegacion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController= navHostFragment.navController

        binding.button.setOnClickListener {
            when(navController.currentDestination?.id){
                R.id.yellowFragment -> navController.navigate(YellowFragmentDirections.actionYellowFragmentToGreenFragment())
                R.id.greenFragment->navController.navigate(GreenFragmentDirections.actionGreenFragmentToYellowFragment())
                else-> throw Exception("No hay acción definida desde el fragment actual")
            }
        }
    }
}