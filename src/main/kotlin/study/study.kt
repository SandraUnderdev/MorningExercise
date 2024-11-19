package org.example.study

import org.example.Day3.mod


fun main() {
    val text = listOf("Hey", "You") // immutable
    // text.add

    //  list
    //val text2 = mutableListOf("Hey", "You") // can change
    val text2 = mutableListOf<String>() // can change
    val text4 = text2.toMutableSet()

    val text3 = mutableListOf<Any>() // any type
    text3.add("Sandra")
    text3.add(5)

    lateinit var tex : String


    // set - unique items

    // map - key value pair
    val shoppingCart = mutableMapOf<String, Int>()
    shoppingCart["Hi"] = 279 // no need for put()
    println(shoppingCart["Hi"]) //no need for get()
/// collections

//mutable - can change

}