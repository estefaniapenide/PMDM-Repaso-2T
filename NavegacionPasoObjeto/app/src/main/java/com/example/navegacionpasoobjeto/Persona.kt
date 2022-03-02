package com.example.navegacionpasoobjeto

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Persona(val nombre:String, val apellidos:String, val edad:Int, val email: String) :
    Parcelable {

}