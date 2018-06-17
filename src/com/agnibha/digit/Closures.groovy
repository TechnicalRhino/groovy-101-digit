package com.agnibha.digit

class Closures {
    static void main(String[] args) {
        //Blank Closure
        def helloworldPrinter = { -> println("Hellow World") }

        //Calling a closure
        helloworldPrinter.call()
        //or
        helloworldPrinter()

        //Closure Getting Access of External Parameter
        def greeting = "Hellow"
        def greeter = { name -> println("$greeting $name") }
        greeter.call("Agnibha")

        //Self Calling
        def factorial = { num -> (num <= 1) ? 1 : num * call(num - 1) } //Calling Self by call
        println("Factorial 4 => " + factorial(4))

        //It as a iterative argument. So for a list it would be all the elements
        def numberPrinter = { it -> println(it) }
        [1, 2, 3].forEach(numberPrinter)

        //For map the it parameter will be every element
        [name: "Agnibha", age: 26, Country: "India"].each({ it -> println("$it.key -> $it.value") })
        //Mind the each function

        // Print only evens
        def randNums = [1, 2, 3, 4, 5, 6]
        randNums.each { num -> if (num % 2 == 0) println(num) }

        // find returns a match
        def nameList = ['A', 'B', 'C']
        def matchEle = nameList.find { item -> item == 'A' }
        println(matchEle)

        // findAll finds all matches
        def randNumList = [1, 2, 3, 4, 5, 6]
        def numMatches = randNumList.findAll { item -> item > 4 }
        println(numMatches)

        // any checks if any item matches
        println("> 5 : " + randNumList.any { item -> item > 5 })

        // every checks that all items match
        println("> 1 : " + randNumList.every { item -> item > 1 })

        // collect performs operations on every item
        println("Double : " + randNumList.collect { item -> item * 2 })

    }
}
