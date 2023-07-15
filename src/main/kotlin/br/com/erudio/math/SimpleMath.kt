package br.com.erudio.math

import org.springframework.web.bind.annotation.PathVariable

class SimpleMath {
    fun sum(numberOne: Double, numberTwo: Double)= numberOne + numberTwo

    fun subtraction(numberOne: Double, numberTwo: Double)= numberOne - numberTwo

    fun multiplication(numberOne: Double, numberTwo: Double)= numberOne * numberTwo

    fun division(numberOne: Double, numberTwo: Double)= numberOne / numberTwo

    fun mean(numberOne: Double, numberTwo: Double)= (numberOne + numberTwo) / 2

    fun pot(numberOne: Double, numberTwo: Double)= Math.pow(numberOne, numberTwo)

    fun squareRoot(number: Double)= Math.sqrt(number)

}