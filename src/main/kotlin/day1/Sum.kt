package org.example.day1

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

fun main(){
    sum(890)
}

fun sum(int: Int) {
    val num = int.toString()
    var sum = 0

    for(char in num ){
      val value = char.digitToInt()
        println("This is value $value")
        sum += value
    }
    println(sum)
}

