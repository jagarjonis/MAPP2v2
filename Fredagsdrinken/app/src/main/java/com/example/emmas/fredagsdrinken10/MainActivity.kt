package com.example.emmas.fredagsdrinken10

import android.content.Intent
import java.util.*

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_meny2.*


class MainActivity : AppCompatActivity() {

    var randomint = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val intent3 = Intent(this, Iste::class.java)


        val intent4 = Intent(this, Cubalibre::class.java)


        val intent5 = Intent(this, Whiterussian::class.java)


        val intent6 = Intent(this, SkinnyBitch::class.java)


        val intent7 = Intent(this, Hotshot::class.java)


        val intent8 = Intent(this, Mojito::class.java)



        btn.setOnClickListener{
            val intent = Intent(this, meny2::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent2 = Intent(this, Utforskadrinkar::class.java)
            startActivity(intent2)
        }

        btn3.setOnClickListener{
            randomint =  Random().nextInt((6-1))+1

            if (randomint == 1) {
                startActivity(intent3)
            } else if(randomint == 2) {
                startActivity(intent4)

            } else if(randomint == 3) {
                startActivity(intent5)

            } else if(randomint == 4) {
                startActivity(intent6)

            } else if(randomint == 5) {
                startActivity(intent7)

            } else if(randomint == 6) {
                startActivity(intent8)

            }

        }
    }

}


