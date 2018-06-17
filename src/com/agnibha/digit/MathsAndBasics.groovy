package com.agnibha.digit

class MathsAndBasics {
    static void main(String[] args) {
        println("Hello World")

        //Defining a variable
        def name = "Agnibha"
        println("Name as a String -> " + name)

        name = 40
        println("name as a Number -> " + name)

        //Basic Maths operation
        println("5 + 6 => " + (5 + 6))
        println("5 - 6 => " + (5 - 6))
        println("5 * 6 => " + (5 * 6))
        println("5 / 6 => " + (5.intdiv(6))) //Look out for the method that is there in the number
        println("5 % 6 => " + (5 % 6))

        //Floating Point operations
        println("5.1 + 6.1 => " + (5.1.plus(6.1))) //Methods can be replaced with operators also
        println("5.1 - 6.1 => " + (5.1.minus(6.1)))
        println("5.1 * 6.1 => " + (5.1.multiply(6.1)))
        println("5.1 / 6.1 => " + (5.1 / 6.1))

        //Order of operations
        println("3 + 5 * 6 => " + (3 + 5 * 6))
        println("(3 + 5) * 6 => " + ((3 + 5) * 6))

        //Math Functions
        def someNum = 2.5
        println("Math.abs(-2.45) = " + (Math.abs(-2.45)))
        println("Math.round(2.45) = " + (Math.round(2.45)))
        println("randNum.pow(3) = " + (someNum.pow(3)))
        println("3.0.equals(2.0) = " + (3.0.equals(2.0)))
        println("randNum.equals(Float.NaN) = " + (someNum.equals(Float.NaN)))
        println("Math.sqrt(9) = " + (Math.sqrt(9)))
        println("Math.cbrt(27) = " + (Math.cbrt(27)))
        println("Math.ceil(2.45) = " + (Math.ceil(2.45)))
        println("Math.floor(2.45) = " + (Math.floor(2.45)))
        println("Math.min(2,3) = " + (Math.min(2, 3)))
        println("Math.max(2,3) = " + (Math.max(2, 3)))
    }
}
