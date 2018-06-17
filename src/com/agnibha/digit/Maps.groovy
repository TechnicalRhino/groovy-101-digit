package com.agnibha.digit

class Maps {
    static void main(String[] args) {
        def map = [
                name   : "ABC",
                age    : 35,
                address: "Somewhere in India",
                list   : [1, 2, 3]
        ]

        def variableKey = "age"

        println("Name => " + map.name)
        println("Age => " + map[variableKey])
        println("List Item 1 => " + map.list[1])

        //Add another value
        map.put("Country", "India")
        println("Map => " + map.toMapString())

        //Check whether a map contains key or value
        println("Map Contains Key Country => " + map.containsKey("Country"))
        println("Map Contains Country Value India => " + map.containsValue("India"))

        //Map's size
        println("Map's Size => " + map.size())
    }
}
