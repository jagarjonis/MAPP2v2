package com.example.emmas.fredagsdrinken10

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Slide
import android.transition.TransitionManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_meny2.*
import java.util.*


class meny2 : AppCompatActivity() {


    val istelista: MutableList<String> = mutableListOf()
    val wrlista: MutableList<String> = mutableListOf()
    val cllista: MutableList<String> = mutableListOf()
    val sblista: MutableList<String> = mutableListOf()
    val hslista: MutableList<String> = mutableListOf()
    val mojitolista: MutableList<String> = mutableListOf()
    var isteingrid = 0
    var antalisteingrid = ""
    var wringrid = 0
    var antalwringrid = ""
    var clingrid = 0
    var antalclingrid = ""
    var sbingrid = 0
    var antalsbingrid = ""
    var hsingrid = 0
    var antalhsingrid = ""
    var mojitoingrid = 0
    var antalmojitoingrid = ""
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

    //JONAS BOOLS
    var limebool = false
    var cocacolabool = false
    var ljusrombool = false
    var mjolkbool = false
    var vodkabool = false
    var kahluabool = false
    var sodavattenbool = false
    var gallianobool = false
    var kaffebool = false
    var graddebool = false
    var tebool = false
    var strosockerbool = false
    var citronbool = false
    var apelsinbool = false
    var applebool = false
    var vitrombool = false
    var myntabladbool = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meny2)

        textView5.visibility = View.GONE
        textView6.visibility = View.GONE
        textView7.visibility = View.GONE
        textView8.visibility = View.GONE
        textView9.visibility = View.GONE
        textView10.visibility = View.GONE
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
        Lista.visibility = View.GONE

        nasta1.setOnClickListener{
            ScrollView1.visibility = View.GONE
            nasta1.visibility = View.GONE
            nasta2.visibility = View.VISIBLE
            textView.visibility = View.GONE
            //apelsin
            if (checkBox9.isChecked) {
                iste = true
                isteingrid++
                antalisteingrid = isteingrid.toString() + "/" + 7
                //TILLAGD BOOL
                apelsinbool = true

            }
            if (checkBox10.isChecked) {
                iste = true
                isteingrid++
                antalisteingrid = isteingrid.toString() + "/" + 7
                citronbool = true
            }
            if (checkBox11.isChecked) {
                cubalibre = true
                clingrid++
                antalclingrid = clingrid.toString() + "/" + 4
                cocacolabool = true
            }
            if (checkBox12.isChecked) {
                hotshot = true
                hsingrid++
                antalhsingrid = hsingrid.toString() + "/" + 3
                gallianobool = true
            }
            if (checkBox13.isChecked) {
                hotshot = true
                hsingrid++
                antalhsingrid = hsingrid.toString() + "/" + 3
                graddebool = true
            }
            if (checkBox14.isChecked) {
                mojito = true
                cubalibre = true
                clingrid++
                antalclingrid = clingrid.toString() + "/" + 4
                mojitoingrid++
                antalmojitoingrid = mojitoingrid.toString() + "/" + 4
                ljusrombool = true
            }
            if (checkBox15.isChecked) {
                skinnybitch = true
                sbingrid++
                antalsbingrid = sbingrid.toString() + "/" + 3
                mojito = true
                mojitoingrid++
                antalmojitoingrid = mojitoingrid.toString() + "/" + 4
                sodavattenbool = true
            }

            if (checkBox16.isChecked) {
                iste = true
                isteingrid++
                antalisteingrid = isteingrid.toString() + "/" + 7
                tebool = true
            }

            if (checkBox17.isChecked) {
                whiterussian = true
                wringrid++
                antalwringrid = wringrid.toString() + "/" + 4
                skinnybitch = true
                sbingrid++
                antalsbingrid = sbingrid.toString() + "/" + 3
                vodkabool = true
            }

            if (checkBox18.isChecked) {
                iste = true
                isteingrid++
                antalisteingrid = isteingrid.toString() + "/" + 7
                applebool = true
            }

            if (checkBox19.isChecked) {
                iste = true
                isteingrid++
                antalisteingrid = isteingrid.toString() + "/" + 7
            }

            if (checkBox20.isChecked) {
                iste = true
                isteingrid++
                antalisteingrid = isteingrid.toString() + "/" + 7
                mojito = true
                mojitoingrid++
                antalmojitoingrid = mojitoingrid.toString() + "/" + 4
                strosockerbool = true
            }

            if (checkBox21.isChecked) {
                whiterussian = true
                cubalibre = true
                iste = true
                isteingrid++
                antalisteingrid = isteingrid.toString() + "/" + 7
                clingrid++
                antalclingrid = clingrid.toString() + "/" + 4
                wringrid++
                antalwringrid = wringrid.toString() + "/" + 4

            }

            if (checkBox22.isChecked) {
                whiterussian = true
                wringrid++
                antalwringrid = wringrid.toString() + "/" + 4
                mjolkbool = true
            }

            if (checkBox23.isChecked) {
                cubalibre = true
                skinnybitch = true
                mojito = true
                clingrid++
                antalclingrid = clingrid.toString() + "/" + 4
                mojitoingrid++
                antalmojitoingrid = mojitoingrid.toString() + "/" + 4
                sbingrid++
                antalsbingrid = sbingrid.toString() + "/" + 3
                limebool = true
            }

            if (checkBox24.isChecked) {
                whiterussian = true
                wringrid++
                antalwringrid = wringrid.toString() + "/" + 4
                kahluabool = true
            }

            if (checkBox25.isChecked) {
                hotshot = true
                hsingrid++
                antalhsingrid = hsingrid.toString() + "/" + 3
                kaffebool = true

            }

            if (iste) {
                checkBox26.visibility = View.VISIBLE
                textView5.visibility = View.VISIBLE

            }
            if (cubalibre) {
                checkBox27.visibility = View.VISIBLE
                textView6.visibility = View.VISIBLE

            }
            if (whiterussian) {
                checkBox28.visibility = View.VISIBLE
                textView7.visibility = View.VISIBLE
            }
            if (skinnybitch) {
                checkBox29.visibility = View.VISIBLE
                textView8.visibility = View.VISIBLE
            }
            if (hotshot) {
                checkBox30.visibility = View.VISIBLE
                textView9.visibility = View.VISIBLE
            }
            if (mojito) {
                checkBox31.visibility = View.VISIBLE
                textView10.visibility = View.VISIBLE
            }
            val textView5 = findViewById(R.id.textView5) as TextView
            textView5.text = (antalisteingrid)
            val textView6 = findViewById(R.id.textView6) as TextView
            textView6.text = (antalclingrid)
            val textView7 = findViewById(R.id.textView7) as TextView
            textView7.text = (antalwringrid)
            val textView8 = findViewById(R.id.textView8) as TextView
            textView8.text = (antalsbingrid)
            val textView9 = findViewById(R.id.textView9) as TextView
            textView9.text = (antalhsingrid)
            val textView10 = findViewById(R.id.textView10) as TextView
            textView10.text = (antalmojitoingrid)

        }
        nasta2.setOnClickListener{
            ScrollView2.visibility = View.GONE
            nasta2.visibility = View.GONE
            textView5.visibility = View.GONE
            textView6.visibility = View.GONE
            textView7.visibility = View.GONE
            textView8.visibility = View.GONE
            textView9.visibility = View.GONE
            textView10.visibility = View.GONE
            Lista.visibility = View.VISIBLE


            // TESTADE MED APELSINBOOLS
            if (isterecept) {
                Alternativ1.visibility = View.VISIBLE
                if(!apelsinbool) {
                    istelista += ("Apelsin")
                }

                if (!applebool) {
                    istelista += ("Äpple")
                }

                if (!citronbool) {
                    istelista += ("Citron")
                }

                if (!strosockerbool) {
                    istelista +=("Strösocker")
                }

                if (!tebool) {
                    istelista +=("Te")
                }
                //SKIPPADE IS OCH VATTEN
            }

            if (cubalibrerecept) {
                Alternativ2.visibility = View.VISIBLE
                if (!ljusrombool) {
                    cllista += ("Ljus Rom")
                }
                if(!cocacolabool) {
                    cllista += ("Coca Cola")
                }
                if(!limebool) {
                    cllista += ("Lime")
                }
            }

            if (whiterussianrecept) {
                Alternativ3.visibility = View.VISIBLE
                if (!kahluabool) {
                    wrlista += ("Kahlúa")
                }
                if(!vodkabool) {
                    wrlista += ("Vodka")
                }
                if(!mjolkbool) {
                    wrlista += ("Mjölk")
                }
            }

            if (skinnybitchrecept) {
                Alternativ4.visibility = View.VISIBLE

                if (!vodkabool) {
                    sblista += ("Vodka")
                }
                if (!sodavattenbool) {
                    sblista += ("Sodavatten")
                }
                if (!limebool) {
                    sblista += ("Lime")
                }
            }

            if (hotshotrecept) {
                Alternativ5.visibility = View.VISIBLE
                if (!kaffebool) {
                    hslista += ("Kaffe")
                }
                if (!gallianobool) {
                    hslista += ("Galliano")
                }
                if (!graddebool) {
                    hslista += ("Grädde")
                }
            }

            if (mojitorecept) {
                Alternativ6.visibility = View.VISIBLE
                if (!vitrombool) {
                    mojitolista += ("Vit Rom")
                }
                if (!sodavattenbool) {
                    mojitolista += ("Sodavatten")
                }
                if (!myntabladbool) {
                    mojitolista += ("Myntablad")
                }
                if (!limebool) {
                    mojitolista += ("Lime")
                }
                if (!strosockerbool) {
                    mojitolista += ("Strösocker")
                }
            }


        }
        Lista.setOnClickListener{
            val istelength = istelista.size
            val wrlength = wrlista.size
            val cllength = cllista.size
            val sblength = sblista.size
            val hslength = hslista.size
            val mojitolength = mojitolista.size
            val inflater: LayoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.another_view,null)
            val popupWindow = PopupWindow(view, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)

            val tv = view.findViewById<TextView>(R.id.textView3)
            val buttonPopup = view.findViewById<Button>(R.id.button_popup)
            buttonPopup.setOnClickListener {
                popupWindow.dismiss()
            }

            popupWindow.showAtLocation(ScrollView1, Gravity.CENTER,0,0)
            
            for (i in 0 until istelength)
                {
             tv.append(istelista[i])
             tv.append("\n")
            }

            for (i in 0 until cllength)
            {
                tv.append(cllista[i])
                tv.append("\n")
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
