package com.kotlin.miniproject

/* Arwa Alomari
*  Ghadeer Alnujaidi
* */
fun main() {
    var animal1 = Animal(4, 20, false, "Horse")

    // 1-7
    println("The ${animal1.name} has a top speed of ${animal1.topSpeed} mph")
    animal1.name = "Dog"
    println("The ${animal1.name} has a top speed of ${animal1.topSpeed} mph")

    // 8
    animal1.displayAnimal()

    // 9
    animal1.numLegs = 5
    animal1.displayAnimal()

    // 10 - Bonus Part
    println("\n10 - Bonus Part")
    var listOfAnimal = mutableListOf<String>("Cat", "Camel", "Horse", "Dog", "Rabbit", "Elephant", "Tiger", "Lion")
    listOfAnimal.forEach {
        var animal = Animal(4, 25, true, it)
        animal.displayAnimal()
    }
}