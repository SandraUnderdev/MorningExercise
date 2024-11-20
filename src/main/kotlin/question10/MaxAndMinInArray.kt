package org.example.question10

fun main() {
    val numbers = intArrayOf(12, 7, 22, 3, 9)
    maxAndMinInArray(numbers)

    val values = intArrayOf(12, 7, 22, 3, 9)
    val result = maxAndMinInList(values)
    println(result)
}

//My solution
fun maxAndMinInArray(numbers : IntArray) {
    if(numbers.isEmpty()){
        throw IllegalArgumentException("Array is empty")
    }

    var max = numbers[0]
    var min = numbers[0]
    val newLists : ArrayList<Int> = ArrayList()
    val totalNumber = numbers.indices

    for(i in totalNumber ) {
       // var value = totalNumber[i]
        if(numbers[i] > max){
            max = numbers[i]
        } else if(numbers[i] < min){
            min = numbers[i]
        }
    }
    newLists.add(min)
    newLists.add(max)
    println(newLists)
}


// best solution The time complexity is O(n) because we go through the array once,
// and the space complexity is O(1) because we only store the minimum and maximum values.
fun maxAndMinInList(numbers : IntArray) : List<Int> {
    if(numbers.isEmpty()){
        throw IllegalArgumentException("Array is empty")
    }

    var max = numbers[0]
    var min = numbers[0]

    for(num in numbers ) {
        // var value = totalNumber[i]
        if(num > max){
            max = num
        } else if(num < min){
            min = num
        }
    }
    return listOf(min,max)
}

