@file:Suppress("unused")
package com.hadihariri.fpkotlin.exercises.functional.basic

val elements = listOf("abc", "def", "ghi")

fun listOfCharactersOfElements(): List<Char> {
    TODO("Return a list of chars")
}

fun listOfCities(): List<String> {
    TODO ("Return list of cities of each country excluding capital")
}

fun listOfCitiesWithCapital(): List<String> {
    TODO("Return list of cities of each country starting with capital")
}

fun listOfCitiesWherePopulationBelow1MillionGroupedByCountry(): List<Pair<String, List<String>>> {
        fun cityNames(country: Country, pred: (City) -> Boolean): List<String> {
            return country.cities.filter { pred(it) }.map { it.name }
        }

        return countries.map { Pair(it.name, cityNames(it, { ct -> ct.population < 10000}))}

}


fun listOfCountriesWhereMoreThanOneCityInSameRegion(): List<String> {
    TODO("Return list of countries where there is more than one city in same region")
}

fun firstAndLastCityOfEachCountry(): List<Pair<String, String>> {
    TODO("Return first and last city of each country")
}

fun main(args: Array<String>) {

}

