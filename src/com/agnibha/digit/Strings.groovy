package com.agnibha.digit

class Strings {
    static void main(String[] args) {
        def singleQuotedString = 'This is a single quoted String'

        def tripleQuotedString = '''This is a triple quoted string
                                with
                                multiline
                                support'''

        def doubleQuotedString = "This is a double quoted String"

        //Interpolation

//        def name = "Agnibha"
//        def interpolatedString = "Hello ${name}"
//        println(interpolatedString)

        def name = "Agnibha"
        println("Character at 3rd Index => " + name[3])
        println("indexOf character 'i' will give first occurrence of the character at position => " + name.indexOf("i"))
        println("First 3 characters of the name => " + name[0..2])
        println("Every other character => " + name[0, 2, 4])
        println("Concatenation example using + operator => " + name)
        println("Concatenation example using .concat method => ".concat(name))


        def repeatedStr = "This string will be there twice " * 2
        println(repeatedStr)
        def removingFirstThis = repeatedStr - "This"
        println(removingFirstThis)

        println("First <=> Second => " + ('first' <=> 'second'))
        println("Second <=> First => " + ('second' <=> 'first'))
        println("First <=> First => " + ('first' <=> 'first'))


    }
}
