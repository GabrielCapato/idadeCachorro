package com.tads.idadecanina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BDescobrir.setOnClickListener{
            var age = Eidade.text.toString()

            val tela = Intent(applicationContext,Main2Activity::class.java)
            tela.putExtra("idade",age)

            startActivity(tela)
        }


    }
}
