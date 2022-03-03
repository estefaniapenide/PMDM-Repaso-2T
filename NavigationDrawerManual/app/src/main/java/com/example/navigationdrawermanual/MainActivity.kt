package com.example.navigationdrawermanual

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
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
                    R.id.nav_ajustes -> {
                        when(navController.currentDestination?.id){
                            R.id.nav_ajustes->findNavController(R.id.fragmentContainerView).navigate(AjustesFragmentDirections.actionNavAjustesSelf())
                            R.id.nav_contactos->findNavController(R.id.fragmentContainerView).navigate(AjustesFragmentDirections.actionNavAjustesToNavContactos())
                            R.id.nav_inicio->findNavController(R.id.fragmentContainerView).navigate(AjustesFragmentDirections.actionNavAjustesToNavInicio())
                        }
                        accion()
                    }
                    R.id.nav_contactos -> {
                        when(navController.currentDestination?.id){
                            R.id.nav_contactos->findNavController(R.id.fragmentContainerView).navigate(ContactosFragmentDirections.actionNavContactosSelf())
                            R.id.nav_ajustes->findNavController(R.id.fragmentContainerView).navigate(ContactosFragmentDirections.actionNavContactosToNavAjustes())
                            R.id.nav_inicio->findNavController(R.id.fragmentContainerView).navigate(ContactosFragmentDirections.actionNavContactosToNavInicio())
                        }
                        accion()
                    }
                    R.id.nav_inicio -> {
                        when(navController.currentDestination?.id){
                            R.id.nav_inicio->findNavController(R.id.fragmentContainerView).navigate(InicioFragmentDirections.actionNavInicioSelf())
                            R.id.nav_ajustes->findNavController(R.id.fragmentContainerView).navigate(InicioFragmentDirections.actionNavInicioToNavAjustes())
                            R.id.nav_contactos->findNavController(R.id.fragmentContainerView).navigate(InicioFragmentDirections.actionNavInicioToNavContactos())
                        }
                        accion()
                    }
            }
            true
        }*/

        //Tampoco funciona con setupWithNavController(), o se usa uno o el otro
       /* val shareItem: MenuItem = binding.navView.getMenu().findItem(R.id.nav_ajustes)
        shareItem.setOnMenuItemClickListener {
            Snackbar.make(binding.root, "Ajustes", Snackbar.LENGTH_SHORT).show()
            binding.drawer.closeDrawer(GravityCompat.START)
            true
        }*/
    }

    private fun accion(){
        //navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        //navController= navHostFragment.navController
        //binding.navView.setupWithNavController(navController)
        binding.drawer.closeDrawer(GravityCompat.START)
    }

   /* private fun accion(int:Int){
        accion(getString(int))
    }*/
}