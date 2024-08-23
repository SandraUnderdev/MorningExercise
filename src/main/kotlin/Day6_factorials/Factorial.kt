package org.example.Day6_factorials


fun main(){
    factorial(5)
}

fun factorial(number : Int) {
var total = number
    for(n in number downTo 1) {
        if(n != 1){
            total *= (n - 1)
        }

    }

    println(total)

}


