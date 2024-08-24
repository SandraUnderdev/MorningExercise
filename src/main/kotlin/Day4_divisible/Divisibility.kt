package org.example.Day4

fun main(){
    divisible()
}

fun divisible() {
    val numbers = ArrayList<Int>()
    for (i in 1500..2700 )
    if(i % 5 == 0 && i % 7 == 0){
        numbers.add(i)
    }
        println(numbers)
}