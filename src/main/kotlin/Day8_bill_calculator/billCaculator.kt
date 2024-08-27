package org.example.Day8_bill_calculator

data class Price(val name: String, val price: Double)


fun billCalculator(menuItem: List<Price>) {
    var userInput: String
    var priceList = 0.0

    while (true) {
        println("\nEnter a food item: ")
        userInput = readln()
        if (userInput.isNotBlank()) {
            for (menu in menuItem) {
                if (userInput.contains(menu.name)) {
                    val price = menu.price
                    priceList += price
                }
            }
        } else {
            print("total list now is $priceList")
            break
        }
    }

}



fun main() {

    val menu = listOf(
        Price("Burger", 9.50),
        Price("Vegan", 11.00),
        Price("Hot Dog", 5.00),
        Price("Cheese Dog", 7.00),
        Price("Fries", 5.00),
        Price("Cheese Fries", 6.00),
        Price("Cold Pressed Juice", 7.00),
        Price("Cold Brew", 3.00),
        Price("Water", 2.00),
        Price("Soda", 2.00)
    )
    billCalculator(menu)
}
