package com.example.emmas.fredagsdrinken10

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_meny2.*

class meny2 : AppCompatActivity() {
    var isteingrid
    val antalingrid = isteingrid.toString() + "/" + 5
    var iste = false
    var whiterussian = false
    var cubalibre = false
    var skinnybitch = false
    var hotshot = false
    var mojito = false
    var isterecept = false
    var cubalibrerecept = false
    var whiterussianrecept = false
    var skinnybitchrecept = false
    var hotshotrecept = false
    var mojitorecept = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meny2)

        checkBox26.visibility = View.GONE
        checkBox27.visibility = View.GONE
        checkBox28.visibility = View.GONE
        checkBox29.visibility = View.GONE
        checkBox30.visibility = View.GONE
        checkBox31.visibility = View.GONE
        nasta2.visibility = View.GONE
        Alternativ1.visibility = View.GONE
        Alternativ2.visibility = View.GONE
        Alternativ3.visibility = View.GONE
        Alternativ4.visibility = View.GONE
        Alternativ5.visibility = View.GONE
        Alternativ6.visibility = View.GONE

        nasta1.setOnClickListener{

            ScrollView1.visibility = View.GONE
            nasta1.visibility = View.GONE
            nasta2.visibility = View.VISIBLE
            println(antalingrid)

            if (iste) {
                checkBox26.visibility = View.VISIBLE
            }
            if (cubalibre) {
                checkBox27.visibility = View.VISIBLE
            }
            if (whiterussian) {
                checkBox28.visibility = View.VISIBLE
            }
            if (skinnybitch) {
                checkBox29.visibility = View.VISIBLE
            }
            if (hotshot) {
                checkBox30.visibility = View.VISIBLE
            }
            if (mojito) {
                checkBox31.visibility = View.VISIBLE
            }
        }
        nasta2.setOnClickListener{
            ScrollView2.visibility = View.GONE
            nasta2.visibility = View.GONE

            if (isterecept) {
                Alternativ1.visibility = View.VISIBLE
            }

            if (cubalibrerecept) {
                Alternativ2.visibility = View.VISIBLE
            }

            if (whiterussianrecept) {
                Alternativ3.visibility = View.VISIBLE
            }

            if (skinnybitchrecept) {
                Alternativ4.visibility = View.VISIBLE
            }

            if (hotshotrecept) {
                Alternativ5.visibility = View.VISIBLE
            }

            if (mojitorecept) {
                Alternativ6.visibility = View.VISIBLE
            }

        }
        Alternativ1.setOnClickListener{
            val intent1 = Intent(this, Iste::class.java)
            startActivity(intent1)
        }
        Alternativ2.setOnClickListener{
            val intent2 = Intent(this, Cubalibre::class.java)
            startActivity(intent2)
        }
        Alternativ3.setOnClickListener{
            val intent3 = Intent(this, Whiterussian::class.java)
            startActivity(intent3)
        }
        Alternativ4.setOnClickListener{
            val intent1 = Intent(this, SkinnyBitch::class.java)
            startActivity(intent1)
        }
        Alternativ5.setOnClickListener{
            val intent5 = Intent(this, Hotshot::class.java)
            startActivity(intent5)
        }
        Alternativ6.setOnClickListener{
            val intent6 = Intent(this, Mojito::class.java)
            startActivity(intent6)
        }

        val checkBox9 = findViewById<CheckBox>(R.id.checkBox9)
        checkBox9.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                iste = true
                isteingrid.inc()

            }


        }

        val checkBox10 = findViewById<CheckBox>(R.id.checkBox10)
        checkBox10.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                iste = true
            }


        }
        val checkBox11 = findViewById<CheckBox>(R.id.checkBox11)
        checkBox11.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                cubalibre = true
            }


        }
        val checkBox12 = findViewById<CheckBox>(R.id.checkBox12)
        checkBox12.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                hotshot = true
            }


        }
        val checkBox13 = findViewById<CheckBox>(R.id.checkBox13)
        checkBox13.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                hotshot = true
            }


        }
        val checkBox14 = findViewById<CheckBox>(R.id.checkBox14)
        checkBox14.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                mojito = true
                cubalibre = true
            }


        }
        val checkBox15 = findViewById<CheckBox>(R.id.checkBox15)
        checkBox15.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                skinnybitch = true
                mojito = true
            }


        }
        val checkBox16 = findViewById<CheckBox>(R.id.checkBox16)
        checkBox16.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                iste = true
            }


        }
        val checkBox17 = findViewById<CheckBox>(R.id.checkBox17)
        checkBox17.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                whiterussian = true
            }


        }
        val checkBox18 = findViewById<CheckBox>(R.id.checkBox18)
        checkBox18.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                iste = true
            }


        }
        val checkBox19 = findViewById<CheckBox>(R.id.checkBox19)
        checkBox19.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                iste = true
            }


        }
        val checkBox20 = findViewById<CheckBox>(R.id.checkBox20)
        checkBox20.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                iste = true
                mojito = true
            }


        }
        val checkBox21 = findViewById<CheckBox>(R.id.checkBox21)
        checkBox21.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                whiterussian = true
                cubalibre = true
                iste = true
            }


        }
        val checkBox22 = findViewById<CheckBox>(R.id.checkBox22)
        checkBox22.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                whiterussian = true
            }


        }
        val checkBox23 = findViewById<CheckBox>(R.id.checkBox23)
        checkBox23.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                cubalibre = true
                skinnybitch = true
                mojito = true
            }


        }
        val checkBox24 = findViewById<CheckBox>(R.id.checkBox24)
        checkBox24.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                whiterussian = true
            }


        }
        val checkBox25 = findViewById<CheckBox>(R.id.checkBox25)
        checkBox25.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                hotshot = true
            }


        }
        val checkBox26 = findViewById<CheckBox>(R.id.checkBox26)
        checkBox26.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                isterecept = true
            }


        }
        val checkBox27 = findViewById<CheckBox>(R.id.checkBox27)
        checkBox27.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                cubalibrerecept = true
            }


        }
        val checkBox28 = findViewById<CheckBox>(R.id.checkBox28)
        checkBox28.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                whiterussianrecept = true
            }


        }
        val checkBox29 = findViewById<CheckBox>(R.id.checkBox29)
        checkBox29.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                skinnybitchrecept = true
            }


        }
        val checkBox30 = findViewById<CheckBox>(R.id.checkBox30)
        checkBox30.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                hotshotrecept = true
            }


        }
        val checkBox31 = findViewById<CheckBox>(R.id.checkBox31)
        checkBox31.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                mojitorecept = true
            }


        }
    }
}
