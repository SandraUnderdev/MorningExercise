package org.example

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /** 1 Write a Kotlin program to print 'Hello' on screen and your name on a separate line.*/
    println("Hello\nSandra")
   // println("Sandra")

    /** 2 Write a Kotlin program to find out what version of Kotlin you are using.*/
    val kV = KotlinVersion.CURRENT
    println("Kotlin version $kV")

    /** 3 Write a Kotlin program to display the current date and time.*/
//    val date = LocalDate.now()
//    val time = LocalTime.now()
   // println("The curent date and time $date $time")
    val date = LocalDateTime.now()
    println("The curent date and time $date")

    /** 4 Write a Kotlin program to take user input and display it.*/
    println("What is your best color?")
    val userInput = readln()
    println("User best color is $userInput")


}