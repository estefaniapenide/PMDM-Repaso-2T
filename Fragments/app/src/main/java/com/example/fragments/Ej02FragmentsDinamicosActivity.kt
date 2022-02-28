package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.fragments.databinding.ActivityEj02FragmentsDinamicosBinding


class Ej02FragmentsDinamicosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj02FragmentsDinamicosBinding

    lateinit var fragment:Fragment

    val yellowFragment = YellowFragment()
    val greenFragment = GreenFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj02FragmentsDinamicosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar!!.title="FRAGMENTS"

        fragment=yellowFragment


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_cambio,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        gestionFragments()
        return super.onOptionsItemSelected(item)
    }

    fun gestionFragments(){
        fragment = if (fragment == yellowFragment) greenFragment else yellowFragment
        supportFragmentManager.commit {
            addToBackStack(null) /* Este método permite añadir a la pila los cambios de fragments,
                de modo que el botón "atrás" regresará a la transacción previa */
            replace(R.id.fragmentContainerView, fragment)
        }
    }
}