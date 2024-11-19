package org.example.Question9




fun main() {
    // my code
    val num = arrayOf(1,2,3,4)
    reverseArray(num)

// return as numbers
    val numb = arrayOf(1, 2, 3, 4)
    val reversed = reverseA(numb)
    println(reversed.joinToString(", "))

    val numbers = arrayOf(1, 2, 3, 4)
    reverseArrayInPlace(numbers)
    println(numbers.joinToString(", "))

}

// my code Space Complexity O(n) and Time Complexity O(n)
fun reverseArray(numbers: Array<Int>){
    val newArray: ArrayList<Int> = ArrayList()
    val num1 = numbers.size-1
        for(i in num1 downTo 0){
          newArray.add(numbers[i])

    }
    println(newArray)
}

// clean version of my code Space Complexity O(n) and Time Complexity O(n)
fun reverseA(numbers: Array<Int>) : Array<Int> {
    val newArray = Array(numbers.size) {0} // Create a new array of the same size
    for(i in numbers.indices) { // numbers.indices is equivalent to 0 until numbers.size.
        newArray[i] = numbers[numbers.size-1-i]
    }
    return newArray
}


// best solution Space Complexity O(1) and Time Complexity O(n)
fun reverseArrayInPlace(numbers: Array<Int>) {
    // as list fun reverseArrayWith(numbers: ArrayList<Int>) : ArrayList<Int> {
    var start = 0
    var end = numbers.size-1

    while(start < end){
        val temp = numbers[start]
        numbers[start] = numbers[end]
        numbers[end] = temp

        start++
        end--
    }
    // return numbers
}


