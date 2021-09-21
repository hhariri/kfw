@file:Suppress("unused")
package com.hadihariri.fpkotlin.exercises.functional.basic

fun listOfCountriesSortedByName(): List<String>  {
    return countries.sortedBy { it.name }.map { it.name }
}

fun listOfCountriesSortedByPopulation(): List<String> {


    TODO("Return list of countries sorted by population")
}

fun main(args: Array<String>) {
    listOfCountriesSortedByName().forEach {
        println(it)
    }
}