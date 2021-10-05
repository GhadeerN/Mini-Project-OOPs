package com.kotlin.miniproject
/* Arwa Alomari
*  Ghadeer Alnujaidi
* */
class Animal {
    var numLegs: Int
        get() = field
        set(value) {
            if (value != 4)
                field = 0
            else
                field = 4
        }
    var topSpeed: Int
        get() = field
        set(value) {
            field = value
        }
    var isEndangered: Boolean
        get() = field
        set(value) {
            field = value
        }
    var name: String
        get() = "${field.capitalize()}"
        set(value) {
            field = value.capitalize()
        }

    constructor(_numLegs: Int, _topSpeed: Int, _isEndangered: Boolean, _name: String) {
        numLegs = _numLegs
        topSpeed = _topSpeed
        isEndangered = _isEndangered
        name = _name
    }

    // 8
    fun displayAnimal(){
        var text:String
        if (isEndangered)
            text = "danger animal"
        else
            text= "not a danger animal"
        var numlegText: String
        // 9
        if(numLegs == 0)
            numlegText = "incorrect no"
        else
            numlegText = numLegs.toString()
        println("The ${name.capitalize()} has top speed of $topSpeed mph. It has $numlegText legs and is $text")
    }
}

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