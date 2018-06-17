package com.agnibha.digit

class Ranges {
    static void main(String[] args) {
        def rangeOfNum = 0..10
        def rangeOfChars = 'a'..'z'
        def rangeOfCharsReverse = 'z'..'a'

        println("Number range => " + rangeOfNum.toListString())
        println("Range of Chars => " + rangeOfChars.toListString())
        println("Range Of Chars Reverse => " + rangeOfCharsReverse.toListString())

        //Get Size
        println("Number Range Size => " + rangeOfNum.size())

        //Get Index
        println("19th Character in a-z => " + rangeOfChars.get(18))

        //Contains
        println("Range of Number Contains 11 => " + rangeOfNum.contains(11))

        //Get Last Item
        println("Last item in Range of Chars => " + rangeOfChars.getTo())

        //Get First Item
        println("First Item in Range of Chars => " + rangeOfChars.getFrom())
    }
}
