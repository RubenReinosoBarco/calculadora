package com.example.ruben.calculadora

import android.content.Context
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.*


class MainActivity : AppCompatActivity(), TextWatcher, View.OnClickListener {


    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }


    override fun afterTextChanged(s: Editable?) {
    }

    private var deci: Int = 0
    private var i: Int = 0
    private var horizontal: Boolean = false
    private var resultado: Float = 0f
    private var entro: Boolean = false
    private var entroOperacion: Boolean = false
    private var entroOperacionr: Boolean = false
    private var entroOperacionm: Boolean = false
    private var entroOperaciond: Boolean = false
    private var operador: String? = null
    private var operadorAnterior: String? = null
    private var valorAnterior: String? = null
    private var valorMemoria: String? = null
    private var textView_operaciones: TextView? = null
    private var button_uno: Button? = null
    private var button_dos: Button? = null
    private var button_tres: Button? = null
    private var button_cuatro: Button? = null
    private var button_cinco: Button? = null
    private var button_seis: Button? = null
    private var button_siete: Button? = null
    private var button_ocho: Button? = null
    private var button_nueve: Button? = null
    private var button_cero: Button? = null
    private var button_sumar: Button? = null
    private var button_restar: Button? = null
    private var button_multiplicar: Button? = null
    private var button_dividir: Button? = null
    private var button_igual: Button? = null
    private var button_coma: Button? = null
    private var button_c: Button? = null
    private var button_mc: Button? = null
    private var button_mcSumar: Button? = null
    private var button_mcRestar: Button? = null
    private var button_mr: Button? = null
    private var button_a: Button? = null
    private var button_b: Button? = null
    private var button_c2: Button? = null
    private var button_d: Button? = null
    private var button_e: Button? = null
    private var button_f: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView_operaciones = findViewById<TextView>(R.id.textView_operaciones)
        button_uno = findViewById<Button>(R.id.button_uno)
        button_dos = findViewById<Button>(R.id.button_dos)
        button_tres = findViewById<Button>(R.id.button_tres)
        button_cuatro = findViewById<Button>(R.id.button_cuatro)
        button_cinco = findViewById<Button>(R.id.button_cinco)
        button_seis = findViewById<Button>(R.id.button_seis)
        button_siete = findViewById<Button>(R.id.button_siete)
        button_ocho = findViewById<Button>(R.id.button_ocho)
        button_nueve = findViewById<Button>(R.id.button_nueve)
        button_cero = findViewById<Button>(R.id.button_cero)
        button_sumar = findViewById<Button>(R.id.button_sumar)
        button_restar = findViewById<Button>(R.id.button_restar)
        button_multiplicar = findViewById<Button>(R.id.button_multiplicar)
        button_dividir = findViewById<Button>(R.id.button_dividir)
        button_igual = findViewById<Button>(R.id.button_igual)
        button_coma = findViewById<Button>(R.id.button_coma)
        button_c = findViewById<Button>(R.id.button_c)
        button_mc = findViewById<Button>(R.id.button_mc)
        button_mcSumar = findViewById<Button>(R.id.button_mcSumar)
        button_mcRestar = findViewById<Button>(R.id.button_mcRestar)
        button_mr = findViewById<Button>(R.id.button_mr)


        button_uno!!.setOnClickListener(this)
        button_dos!!.setOnClickListener(this)
        button_tres!!.setOnClickListener(this)
        button_cuatro!!.setOnClickListener(this)
        button_cinco!!.setOnClickListener(this)
        button_seis!!.setOnClickListener(this)
        button_siete!!.setOnClickListener(this)
        button_ocho!!.setOnClickListener(this)
        button_nueve!!.setOnClickListener(this)
        button_cero!!.setOnClickListener(this)
        button_sumar!!.setOnClickListener(this)
        button_restar!!.setOnClickListener(this)
        button_multiplicar!!.setOnClickListener(this)
        button_dividir!!.setOnClickListener(this)
        button_igual!!.setOnClickListener(this)
        button_coma!!.setOnClickListener(this)
        button_c!!.setOnClickListener(this)
        button_mc!!.setOnClickListener(this)
        button_mcSumar!!.setOnClickListener(this)
        button_mcRestar!!.setOnClickListener(this)
        button_mr!!.setOnClickListener(this)

    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        if (newConfig?.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.horizontal)
            horizontal = true
            textView_operaciones = findViewById<TextView>(R.id.textView_operaciones)
            button_uno = findViewById<Button>(R.id.button_uno)
            button_dos = findViewById<Button>(R.id.button_dos)
            button_tres = findViewById<Button>(R.id.button_tres)
            button_cuatro = findViewById<Button>(R.id.button_cuatro)
            button_cinco = findViewById<Button>(R.id.button_cinco)
            button_seis = findViewById<Button>(R.id.button_seis)
            button_siete = findViewById<Button>(R.id.button_siete)
            button_ocho = findViewById<Button>(R.id.button_ocho)
            button_nueve = findViewById<Button>(R.id.button_nueve)
            button_cero = findViewById<Button>(R.id.button_cero)
            button_sumar = findViewById<Button>(R.id.button_sumar)
            button_restar = findViewById<Button>(R.id.button_restar)
            button_multiplicar = findViewById<Button>(R.id.button_multiplicar)
            button_dividir = findViewById<Button>(R.id.button_dividir)
            button_igual = findViewById<Button>(R.id.button_igual)
            button_coma = findViewById<Button>(R.id.button_coma)
            button_c = findViewById<Button>(R.id.button_c)
            button_a = findViewById<Button>(R.id.button_a)
            button_b = findViewById<Button>(R.id.button_b)
            button_c2 = findViewById<Button>(R.id.button_c2)
            button_d = findViewById<Button>(R.id.button_d)
            button_e = findViewById<Button>(R.id.button_e)
            button_f = findViewById<Button>(R.id.button_f)



            button_uno!!.setOnClickListener(this)
            button_dos!!.setOnClickListener(this)
            button_tres!!.setOnClickListener(this)
            button_cuatro!!.setOnClickListener(this)
            button_cinco!!.setOnClickListener(this)
            button_seis!!.setOnClickListener(this)
            button_siete!!.setOnClickListener(this)
            button_ocho!!.setOnClickListener(this)
            button_nueve!!.setOnClickListener(this)
            button_cero!!.setOnClickListener(this)
            button_sumar!!.setOnClickListener(this)
            button_restar!!.setOnClickListener(this)
            button_multiplicar!!.setOnClickListener(this)
            button_dividir!!.setOnClickListener(this)
            button_igual!!.setOnClickListener(this)
            button_c!!.setOnClickListener(this)
            button_a!!.setOnClickListener(this)
            button_b!!.setOnClickListener(this)
            button_c2!!.setOnClickListener(this)
            button_d!!.setOnClickListener(this)
            button_e!!.setOnClickListener(this)
            button_f!!.setOnClickListener(this)


        } else {
            setContentView(R.layout.activity_main)
            horizontal = false
            textView_operaciones = findViewById<TextView>(R.id.textView_operaciones)
            button_uno = findViewById<Button>(R.id.button_uno)
            button_dos = findViewById<Button>(R.id.button_dos)
            button_tres = findViewById<Button>(R.id.button_tres)
            button_cuatro = findViewById<Button>(R.id.button_cuatro)
            button_cinco = findViewById<Button>(R.id.button_cinco)
            button_seis = findViewById<Button>(R.id.button_seis)
            button_siete = findViewById<Button>(R.id.button_siete)
            button_ocho = findViewById<Button>(R.id.button_ocho)
            button_nueve = findViewById<Button>(R.id.button_nueve)
            button_cero = findViewById<Button>(R.id.button_cero)
            button_sumar = findViewById<Button>(R.id.button_sumar)
            button_restar = findViewById<Button>(R.id.button_restar)
            button_multiplicar = findViewById<Button>(R.id.button_multiplicar)
            button_dividir = findViewById<Button>(R.id.button_dividir)
            button_igual = findViewById<Button>(R.id.button_igual)
            button_coma = findViewById<Button>(R.id.button_coma)
            button_c = findViewById<Button>(R.id.button_c)
            button_mc = findViewById<Button>(R.id.button_mc)
            button_mcSumar = findViewById<Button>(R.id.button_mcSumar)
            button_mcRestar = findViewById<Button>(R.id.button_mcRestar)
            button_mr = findViewById<Button>(R.id.button_mr)


            button_uno!!.setOnClickListener(this)
            button_dos!!.setOnClickListener(this)
            button_tres!!.setOnClickListener(this)
            button_cuatro!!.setOnClickListener(this)
            button_cinco!!.setOnClickListener(this)
            button_seis!!.setOnClickListener(this)
            button_siete!!.setOnClickListener(this)
            button_ocho!!.setOnClickListener(this)
            button_nueve!!.setOnClickListener(this)
            button_cero!!.setOnClickListener(this)
            button_sumar!!.setOnClickListener(this)
            button_restar!!.setOnClickListener(this)
            button_multiplicar!!.setOnClickListener(this)
            button_dividir!!.setOnClickListener(this)
            button_igual!!.setOnClickListener(this)
            button_coma!!.setOnClickListener(this)
            button_c!!.setOnClickListener(this)
            button_mc!!.setOnClickListener(this)
            button_mcSumar!!.setOnClickListener(this)
            button_mcRestar!!.setOnClickListener(this)
            button_mr!!.setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {


        when (v?.id) {

            R.id.button_uno -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "1")
            }
            R.id.button_dos -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "2")
            }
            R.id.button_tres -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "3")
            }
            R.id.button_cuatro -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "4")
            }
            R.id.button_cinco -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "5")
            }
            R.id.button_seis -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "6")
            }
            R.id.button_siete -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "7")
            }
            R.id.button_ocho -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "8")
            }
            R.id.button_nueve -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "9")
            }
            R.id.button_cero -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "0")
            }
            R.id.button_coma -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + ".")
            }
            R.id.button_a -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "A")
            }
            R.id.button_b -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "B")
            }
            R.id.button_c2 -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "C")
            }
            R.id.button_d -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "D")
            }
            R.id.button_e -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "E")
            }
            R.id.button_f -> {
                textView_operaciones?.setText(textView_operaciones?.text.toString() + "F")
            }


            R.id.button_sumar -> {

                if (textView_operaciones?.text == "") {

                } else {
                    if (operadorAnterior != "" && operadorAnterior != null) {
                        if (operadorAnterior == "+") {
                            if (horizontal == true) {

                                resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                            } else {
                                resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toFloat()
                            }
                            valorAnterior = resultado.toString()
                            operador = "+"
                            operadorAnterior = operador
                            textView_operaciones?.setText("")

                        } else if (operadorAnterior == "-") {
                            if (horizontal == true) {

                                resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                            } else {
                                resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toFloat()
                            }
                            valorAnterior = resultado.toString()
                            operador = "+"
                            operadorAnterior = operador
                            textView_operaciones?.setText("")

                        } else if (operadorAnterior == "*") {
                            if (horizontal == true) {

                                resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                            } else {
                                resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toFloat()
                            }
                            valorAnterior = resultado.toString()
                            operador = "+"
                            operadorAnterior = operador
                            textView_operaciones?.setText("")

                        } else if (operadorAnterior == "/") {
                            if (horizontal == true) {

                                resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                            } else {
                                resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toFloat()
                            }
                            valorAnterior = resultado.toString()
                            operador = "+"
                            operadorAnterior = operador
                            textView_operaciones?.setText("")

                        }
                    } else {
                        operador = "+"
                        operadorAnterior = "+"
                        this.valorAnterior = textView_operaciones?.text.toString()
                        if (horizontal == true) {
                            this.valorAnterior = textView_operaciones?.text.toString().toLong(radix = 16).toString()
                        } else {
                            this.valorAnterior = textView_operaciones?.text.toString()
                        }
                        textView_operaciones?.setText("")


                    }

                }
            }
            R.id.button_restar -> {


                if (textView_operaciones?.text == "") {

                } else {
                    if (operadorAnterior != "" && operadorAnterior != null) {
                        if (operadorAnterior == "+") {
                            if (horizontal == true) {

                                resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                            } else {
                                resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toFloat()
                            }
                            valorAnterior = resultado.toString()
                            operador = "-"
                            operadorAnterior = operador
                            textView_operaciones?.setText("")

                        } else if (operadorAnterior == "-") {
                            if (horizontal == true) {

                                resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                            } else {
                                resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toFloat()
                            }
                            valorAnterior = resultado.toString()
                            operador = "-"
                            operadorAnterior = operador
                            textView_operaciones?.setText("")

                        } else
                            if (operadorAnterior == "*") {
                                if (horizontal == true) {

                                    resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                } else {
                                    resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toFloat()
                                }
                                valorAnterior = resultado.toString()
                                operador = "-"
                                operadorAnterior = operador
                                textView_operaciones?.setText("")

                            } else
                                if (operadorAnterior == "/") {
                                    if (horizontal == true) {

                                        resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                    } else {
                                        resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toFloat()
                                    }
                                    valorAnterior = resultado.toString()
                                    operador = "-"
                                    operadorAnterior = operador
                                    textView_operaciones?.setText("")

                                }


                    } else {
                        operador = "-"
                        operadorAnterior = "-"
                        this.valorAnterior = textView_operaciones?.text.toString()
                        if (horizontal == true) {
                            this.valorAnterior = textView_operaciones?.text.toString().toLong(radix = 16).toString()
                        } else {
                            this.valorAnterior = textView_operaciones?.text.toString()
                        }
                        textView_operaciones?.setText("")


                    }

                }
            }
            R.id.button_multiplicar -> {
                if (textView_operaciones?.text == "") {

                } else {
                    if (operadorAnterior != "" && operadorAnterior != null) {
                        if (operadorAnterior == "+") {
                            if (horizontal == true) {

                                resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                            } else {
                                resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toFloat()
                            }
                            valorAnterior = resultado.toString()
                            operador = "*"
                            operadorAnterior = operador
                            textView_operaciones?.setText("")

                        } else
                            if (operadorAnterior == "-") {
                                if (horizontal == true) {

                                    resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                } else {
                                    resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toFloat()
                                }
                                valorAnterior = resultado.toString()
                                operador = "*"
                                operadorAnterior = operador
                                textView_operaciones?.setText("")

                            } else
                                if (operadorAnterior == "*") {
                                    if (horizontal == true) {

                                        resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                    } else {
                                        resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toFloat()
                                    }
                                    valorAnterior = resultado.toString()
                                    operador = "*"
                                    operadorAnterior = operador
                                    textView_operaciones?.setText("")

                                } else
                                    if (operadorAnterior == "/") {
                                        if (horizontal == true) {

                                            resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                        } else {
                                            resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toFloat()
                                        }
                                        valorAnterior = resultado.toString()
                                        operador = "*"
                                        operadorAnterior = operador
                                        textView_operaciones?.setText("")

                                    }

                    } else {
                        operadorAnterior = "*"
                        operador = "*"
                        if (horizontal == true) {
                            this.valorAnterior = textView_operaciones?.text.toString().toLong(radix = 16).toString()
                        } else {
                            this.valorAnterior = textView_operaciones?.text.toString()
                        }
                        textView_operaciones?.setText("")

                    }


                }
            }
            R.id.button_dividir -> {
                if (textView_operaciones?.text == "") {

                } else {
                    if (operadorAnterior != "" && operadorAnterior != null) {
                        if (operadorAnterior == "+") {
                            if (horizontal == true) {

                                resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                            } else {
                                resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toFloat()
                            }
                            valorAnterior = resultado.toString()
                            operador = "/"
                            operadorAnterior = operador
                            textView_operaciones?.setText("")

                        } else if (operadorAnterior == "-") {
                            if (horizontal == true) {

                                resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                            } else {
                                resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toFloat()
                            }
                            valorAnterior = resultado.toString()
                            operador = "/"
                            operadorAnterior = operador
                            textView_operaciones?.setText("")

                        } else
                            if (operadorAnterior == "*") {
                                if (horizontal == true) {

                                    resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                } else {
                                    resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toFloat()
                                }
                                valorAnterior = resultado.toString()
                                operador = "/"
                                operadorAnterior = operador
                                textView_operaciones?.setText("")

                            } else
                                if (operadorAnterior == "/") {
                                    if (horizontal == true) {

                                        resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                    } else {
                                        resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toFloat()
                                    }
                                    valorAnterior = resultado.toString()
                                    operador = "/"
                                    operadorAnterior = operador
                                    textView_operaciones?.setText("")

                                }


                    } else {
                        operador = "/"
                        operadorAnterior = "/"
                        if (horizontal == true) {
                            this.valorAnterior = textView_operaciones?.text.toString().toLong(radix = 16).toString()
                        } else {
                            this.valorAnterior = textView_operaciones?.text.toString()
                        }
                        textView_operaciones?.setText("")


                    }

                }
            }

            R.id.button_mcRestar -> {

                if (this.entro == true) {
                    resultado = valorMemoria?.toFloat()!! - textView_operaciones?.text.toString().toFloat()
                    textView_operaciones?.setText(resultado.toString());
                    valorMemoria = textView_operaciones?.text.toString()
                } else {
                    valorMemoria = textView_operaciones?.text.toString()
                    this.entro = true
                }

            }
            R.id.button_mcSumar -> {

                if (this.entro == true) {
                    resultado = valorMemoria?.toFloat()!! + textView_operaciones?.text.toString().toFloat()
                    textView_operaciones?.setText(resultado.toString());
                    valorMemoria = textView_operaciones?.text.toString()
                } else {
                    valorMemoria = textView_operaciones?.text.toString()
                    this.entro = true

                }

            }

            R.id.button_mr -> {
                textView_operaciones?.setText(valorMemoria.toString());
                Toast.makeText(this@MainActivity, valorMemoria, Toast.LENGTH_LONG).show()


            }


            R.id.button_igual -> {
                if (textView_operaciones?.text.toString().equals("")) {

                    Toast.makeText(this@MainActivity, "Falta un numero/" +
                            "A number is missing", Toast.LENGTH_LONG).show()

                } else {
                    if (valorAnterior != "") {
                        when (operador) {
                            "+" -> {

                                if (horizontal == true) {

                                    resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                } else {
                                    resultado = this.valorAnterior?.toFloat()!! + textView_operaciones?.text.toString().toFloat()
                                }


                                if (horizontal == true) {
                                    i = resultado.toInt()
                                    textView_operaciones?.setText(Integer.toHexString(i))
                                } else {
                                    textView_operaciones?.setText(resultado.toString())
                                }
                                if (horizontal == true) {
                                    this.valorAnterior = textView_operaciones?.text.toString().toLong(radix = 16).toString()
                                } else {
                                    this.valorAnterior = textView_operaciones?.text.toString()
                                }

//                            Toast.makeText(this@MainActivity, valorAnterior, Toast.LENGTH_LONG).show()
                            }
                            "-" -> {
                                if (horizontal == true) {

                                    resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                } else {
                                    resultado = this.valorAnterior?.toFloat()!! - textView_operaciones?.text.toString().toFloat()
                                }
                                if (horizontal == true) {
                                    i = resultado.toInt()
                                    textView_operaciones?.setText(Integer.toHexString(i));
                                } else {
                                    textView_operaciones?.setText(resultado.toString());
                                }
                                this.valorMemoria = textView_operaciones?.text.toString()
                            }
                            "*" -> {
                                if (horizontal == true) {

                                    resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                } else {
                                    resultado = this.valorAnterior?.toFloat()!! * textView_operaciones?.text.toString().toFloat()
                                }
                                if (horizontal == true) {
                                    i = resultado.toInt()
                                    textView_operaciones?.setText(Integer.toHexString(i));
                                } else {
                                    textView_operaciones?.setText(resultado.toString());
                                }
                                valorMemoria = textView_operaciones?.text.toString()

                            }
                            "/" -> {
                                if (horizontal == true) {

                                    resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toLong(radix = 16).toString().toFloat()
                                } else {
                                    resultado = this.valorAnterior?.toFloat()!! / textView_operaciones?.text.toString().toFloat()
                                }
                                if (horizontal == true) {
                                    i = resultado.toInt()
                                    textView_operaciones?.setText(Integer.toHexString(i));
                                } else {
                                    textView_operaciones?.setText(resultado.toString());
                                }
                                valorMemoria = textView_operaciones?.text.toString()
                            }
                        }
                        valorAnterior = ""
                        operador = ""
                        operadorAnterior = null
                    } else {
                        Toast.makeText(this@MainActivity, "error", Toast.LENGTH_LONG).show()
                    }
                }
            }
            R.id.button_c -> {
                textView_operaciones?.setText("")
                operador = "";
                resultado = 0f
                valorAnterior = ""
                entroOperacion = false
                operadorAnterior = ""

            }

            R.id.button_mc -> {
                valorMemoria = ""
                Toast.makeText(this@MainActivity, valorMemoria, Toast.LENGTH_LONG).show()
            }

        }

    }
}
