package org.example.day5

fun main(){
    powers(5.0, 2.0)
}

fun powers(num1 : Double, num2:Double) {
   val power = Math.pow(num1, num2)
    println(power)
}