package com.igorwojda.integer.fizzbuzz

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun fizzBuzz(n: Int): List<String> {
    val lista = mutableListOf<String>()
    for (item in 1..n) {
//        if (item % 15 == 0) {
//            lista.add("FizzBuzz")
//        } else if (item % 3 == 0) {
//            lista.add("Fizz")
//        } else if (item % 5 == 0) {
//            lista.add("Buzz")
//        } else {
//            lista.add(item.toString())
//        }
        when {
            item % 15 == 0 -> lista.add("FizzBuzz")
            item % 3 ==0 -> lista.add("Fizz")
            item % 5 == 0-> lista.add("Buzz")
            else -> lista.add(item.toString())
        }
    }
    return lista
}

private class Test {

    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

    @Test
    fun `Calling fizzbuzz with 15 prints out the correct values`() {

        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )

        fizzBuzz(16) shouldBeEqualTo list
    }
}
