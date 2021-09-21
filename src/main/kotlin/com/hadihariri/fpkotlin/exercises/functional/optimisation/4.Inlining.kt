@file:Suppress("unused")
package com.hadihariri.fpkotlin.exercises.functional.optimisation

fun inlineFunction() {
    TODO("Pass two parameters to this function, one inlined, one not and see byte code")
}

fun callingInline() {
    inlineFunction()
}

fun callingInlineAgain() {
    inlineFunction()
}
