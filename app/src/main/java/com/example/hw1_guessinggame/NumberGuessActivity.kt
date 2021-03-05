package com.example.hw1_guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.*
import kotlin.random.Random


class NumberGuessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)

    }

    var numberwin = Random.nextInt(1, 1000)

    var numerodeintentos = 1

    fun adivinarnumero (v: View){

        val numerousuario = findViewById<EditText>(R.id.editTextNumber)
        Integer.parseInt(numerousuario.text.toString())

        if(Integer.parseInt(numerousuario.text.toString()) == numberwin ){
            Toast.makeText( this , "HAS GANADO! EN " + numerodeintentos + "  INTENTOS" , Toast.LENGTH_LONG ).show()
        }
        else if (Integer.parseInt(numerousuario.text.toString()) < numberwin ){
            Toast.makeText( this , "SU NÚMERO ES MAYOR CAREMONDA", Toast.LENGTH_SHORT ).show()
        }
        else {
            Toast.makeText( this , "SU NÚMERO ES MENOR CAREMONDA", Toast.LENGTH_SHORT ).show()
        }

        numerodeintentos = numerodeintentos + 1

    }

    fun volverajugar(v: View){
        numberwin = Random.nextInt(1, 1000)
        numerodeintentos = 1



    }





}




