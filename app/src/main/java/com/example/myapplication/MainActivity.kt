package com.example.myapplication

import java.util.*

fun main() {
    //Variables
//Lenguaje Inferido (No se especifica el tipo de dato)

// val  ->
// var -> variables
//Float - > 12bit
// Int -> 64  NUMERO ENTERO
//Double - > Numero con coma 0.1
//  char -> Un caracter
// String  -> cadena de texto   "Hola mundo"
// Boolean -> true - false
// PRIVATE , PUBLIC , PROTECTED
    val numeroExplicito: Int = 1 //Explicito
    val numeroInferido = 1 //Implicito


// trabajamos con null -> Podemos devolver un null o un numero
    val variableNull: Int? = null

// lateinit  -> DECLARAMOS MAS TARDE , PERO NO QUEREMOS QUE SEA NULL
    lateinit var variableQueAsignaMasTarde: Objects

//PROGRAMACION ORIENTADA A OBJETOS .
/*class Auto -> atributos (variables)
           -> comportamiento (funciones)*/

    //calculadora

    //Declarando variables
    var numeroUno: Int = 0
    var numeroDos: Int = 0

    //Declarando funciones
    fun sumar(numeroUno: Int, numeroDos: Int): Int {
        return numeroUno + numeroDos
    }

    fun restar(numeroUno: Int, numeroDos: Int): Int {
        return numeroUno - numeroDos
    }

    fun dividir(numeroUno: Int, numeroDos: Int): Int {
        return numeroUno / numeroDos
    }

//Usando la variable
    numeroUno = 2
    numeroDos = 10

//Usando la funcion
    val result = sumar(numeroUno, numeroDos)
    println(result)

    numeroUno = -10
    numeroDos = 2

    val resultResta = restar(numeroUno,numeroDos)

    println(resultResta)

    numeroUno = -10
    numeroDos = 2

    val resultDividir = dividir(numeroUno,numeroDos)
    println(resultDividir)
/*
    //
    fun devolverTexto(texto: String): String {
        return texto
    }


    fun sumar(numero1: Int, numero2: Int) {

    }

    fun sumarConParametros(numero1: Int, numero2: Int): Int {
        return numero1 + numero2
    }


    val sumar = sumarConParametros(2, 3)

    val resultadoDeLSuma = sumar + 4

    println(resultadoDeLSuma)


    fun sumarConParametrosYDevolverElNumero(numero1: Int, numero2: Double): Int {
        val resultado = numero1 + numero2

        return resultado.toInt()
    }

    sumarConParametrosYDevolverElNumero(2, 3.0)
    val resultado = sumarConParametrosYDevolverElNumero(2, 3.0)


    val nombre = "pablo"

    fun ponerEnMayuscula(nombre: String) {
        nombre.uppercase()

    }

    fun miNombre(nombre: String): String {
        ponerEnMayuscula(nombre)
        return nombre
    }


    fun imprimirEnConsola(texto: String) {
        println(texto)
    }

    imprimirEnConsola("esto es un textxo")*/

}





