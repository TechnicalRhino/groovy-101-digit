package com.agnibha.digit

class Lists {
    static void main(String[] args) {
        //Defining a List
        def listOfPrimes = [2, 3, 5, 7, 11, 13]

        //To get the values from a list index
        println("First Prime => " + listOfPrimes[0])
        println("Second Prime => " + listOfPrimes.get(1))

        //To get the size of the list
        println("Total Primes in the List => " + listOfPrimes.size())

        //Lists can hold any values
        def mixedBag = ["Agnibha", 26, 'M', [1, 2, 3]]
        println("MixedBag => " + mixedBag.toListString())
        println("2Dim List Value => " + mixedBag[3][1])

        //Adding Values in a list at the end
        mixedBag.add(12)
        mixedBag << 13
        println("MixedBag => " + mixedBag.toListString())

        //Concatenating Two Lists
        mixedBag = mixedBag + [19, 31]
        println("MixedBag => " + mixedBag.toListString())

        //Removing an element from the list
        mixedBag = mixedBag - [31]
        println("MixedBag => " + mixedBag.toListString())

        //Get first 3
        println("MixedBag's First 3 => " + mixedBag[0..2])

        //Check if the list is empty
        println("MixedBag is empty => " + mixedBag.isEmpty())

        //Get Matches From a List
        println("MixedBag Matches => " + mixedBag.intersect([19, 13, 203]))

        //Reverse a List
        println("MixedBag Reveresed => " + mixedBag.reverse())

        //Sort a List
        println("MixedBag Sorted => " + mixedBag.sort())

        //Pop the last element of the list
        println("MixedBag's Last element => " + mixedBag.pop())


    }
}
