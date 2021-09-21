@file:Suppress("unused")
package com.hadihariri.fpkotlin.exercises.functional.composing

import com.hadihariri.fpkotlin.exercises.functional.basic.*


interface Repository {
    fun getAll(): List<Person>
}

class InMemoryRepository: Repository {
    override fun getAll(): List<Person> {
        return listOf(Person("Joe", "Smith", "UK", emptyList()), Person("Marie", "Alexandra", "France", emptyList()))
    }
}

class Controller(repository: Repository): Repository by repository {

    fun index(): String {
        val people = getAll().map { "<p>${it.firstName} ${it.lastName}</p>" }
        return "<HTML><BODY>${people.joinToString("")}</BODY></HTML>"
    }
}

fun main(args: Array<String>) {

    // 1. Refactor class dependency injection out
}
