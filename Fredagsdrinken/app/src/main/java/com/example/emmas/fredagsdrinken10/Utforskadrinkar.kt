package com.example.emmas.fredagsdrinken10

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_utforskadrinkar.*


class Utforskadrinkar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utforskadrinkar)

        Alternativ1.setOnClickListener {
            val intent1 = Intent(this, Iste::class.java)
            startActivity(intent1)
        }
        Alternativ2.setOnClickListener {
            val intent2 = Intent(this, Cubalibre::class.java)
            startActivity(intent2)
        }
        Alternativ3.setOnClickListener {
            val intent3 = Intent(this, Whiterussian::class.java)
            startActivity(intent3)
        }
        Alternativ4.setOnClickListener {
            val intent1 = Intent(this, SkinnyBitch::class.java)
            startActivity(intent1)
        }
        Alternativ5.setOnClickListener {
            val intent5 = Intent(this, Hotshot::class.java)
            startActivity(intent5)
        }
        Alternativ6.setOnClickListener {
            val intent6 = Intent(this, Mojito::class.java)
            startActivity(intent6)
        }
    }

}
