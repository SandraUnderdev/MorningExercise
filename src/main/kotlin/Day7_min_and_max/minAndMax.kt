package org.example.Day7_min_and_max


fun main() {
    val list = listOf(5,2,9,8,-1,6,7,12,0)
    val lists = listOf<Int>()
    minAndMax(list)
}

fun minAndMax(number: List<Int>) {
    if (number.isEmpty()) {
        println("The list is empty.")
    } else {
        var max = number[0]
        var min = max
        for (n in number) {
            if (n > max) {
                max = n
            }
            if (n < min) {
                min = n
            }
        }
        println("The maximum number is $max and minimum number is $min")
    }
}






