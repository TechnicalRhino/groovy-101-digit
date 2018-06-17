package com.agnibha.digit

class Conditionals {
    static void main(String[] args) {
        def someCondition = true
        def anotherCondition = false

        if (someCondition) {
            println("Do For Some Condition")
        } else if (anotherCondition) {
            println("Do For another Condtion")
        } else {
            println("Do otherwise")
        }


        def x = 1.23
        def result = ""

        switch (x) {
            case "foo":
                result = "found foo"
        // lets fall through
            case "bar":
                result += "bar"

            case [4, 5, 6, 'inList']:
                result = "list"
                break

            case 12..30:
                result = "range"
                break

            case Integer:
                result = "integer"
                break

            case Number:
                result = "number"
                break

            case ~/fo*/: // toString() representation of x matches the pattern?
                result = "foo regex"
                break

            case { it < 0 }: // or { x < 0 }
                result = "negative"
                break

            default:
                result = "default"
        }
        println("Result => " + result)

        //Ternary Operator

        def value = someCondition ? "First" : "Second"
        println("Value => " + value)

        //Elvis Operator
        def obj = [
                age : 26
        ]

        def name = obj.name ?: "Anonymous"
        println("Name => " + name)
    }
}
