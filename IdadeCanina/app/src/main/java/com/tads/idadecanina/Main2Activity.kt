package com.tads.idadecanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //stackOverFlow - Como pegar os dados da primary intent
        var dataPackage: Bundle? = intent.extras

        var age = dataPackage?.getString("idade")

        idadecaninaToIdadeHumana(age.toString())
    }

    private fun idadecaninaToIdadeHumana(age: String){

        var parseIdade = age?.toInt()

        var idadeHumana = parseIdade * 7

        TextResult.setText(idadeHumana.toString())
    }
}
