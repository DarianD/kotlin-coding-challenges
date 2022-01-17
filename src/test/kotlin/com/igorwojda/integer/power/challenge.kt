package com.igorwojda.integer.power

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun power(base: Int, exponent: Int): Int {
//    var result = 1
//    for (i in 1..exponent){
//        result *= base
//    }
//
//    return result

    //Initializer functions for lists
    val myList2 = List(exponent) {base}
    return myList2.reduce{sum, element -> sum * element}
    var s: String = ""


    //Fold
//    val myList = mutableListOf<Int>()
//    for (i in 1..exponent){
//        myList.add(base)
//    }
//    return myList.fold(1) { sum, element -> sum * element }

}

private class Test {
    @Test
    fun `power 2^1 returns 2`() {
        power(2, 1) shouldBeEqualTo 2
    }

    @Test
    fun `power 2^2 returns 2`() {
        power(2, 2) shouldBeEqualTo 4
    }

    @Test
    fun `power 2^3 returns 8`() {
        power(2, 3) shouldBeEqualTo 8
    }

    @Test
    fun `power 3^4 returns 81`() {
        power(3, 4) shouldBeEqualTo 81
    }
}
