package com.example.emmas.fredagsdrinken10

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_meny2.*

class meny2 : AppCompatActivity() {

    var iste = false
    var whiterussian = false
    var cubalibre = false
    var skinnybitch = false
    var hotshot = false
    var mojito = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meny2)

        checkBox26.setVisibility(View.GONE)
        checkBox27.setVisibility(View.GONE)
        checkBox28.setVisibility(View.GONE)
        checkBox29.setVisibility(View.GONE)
        checkBox30.setVisibility(View.GONE)
        checkBox31.setVisibility(View.GONE)


        nasta1.setOnClickListener{

            ScrollView1.setVisibility(View.GONE)
            if (iste == true) {
                checkBox26.setVisibility(View.VISIBLE)
            }
            if (cubalibre == true) {
                checkBox27.setVisibility(View.VISIBLE)
            }
            if (whiterussian == true) {
                checkBox28.setVisibility(View.VISIBLE)
            }
            if (skinnybitch == true) {
                checkBox29.setVisibility(View.VISIBLE)
            }
            if (hotshot == true) {
                checkBox30.setVisibility(View.VISIBLE)
            }
            if (mojito == true) {
                checkBox31.setVisibility(View.VISIBLE)
            }
        }

        val checkBox9 = findViewById<CheckBox>(R.id.checkBox9)
        checkBox9.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                iste = true
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

    }
}
