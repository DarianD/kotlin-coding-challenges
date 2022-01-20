package com.igorwojda.list.sumzero

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun sumZero(list: List<Int>): Pair<Int, Int>? {
    if (list.isEmpty()) return null

    var start = 0
    var end = list.lastIndex

    while (start != end) {
        val element1 = list[start]
        val element2 = list[end]
        val sum = element1 + element2

        when {
            sum == 0 -> return element1 to element2
            sum > 0 -> end--
            sum < 0 -> start++
        }
    }

    return null
}

private class Test {
    @Test
    fun `sumZero empty list return null`() {
        sumZero(listOf()) shouldBeEqualTo null
    }

    @Test
    fun `sumZero 1, 2 return null`() {
        sumZero(listOf(1, 2)) shouldBeEqualTo null
    }

    @Test
    fun `sumZero 1, 2, 4, 7 return null`() {
        sumZero(listOf(1, 2, 4, 7)) shouldBeEqualTo null
    }

    @Test
    fun `sumZero -4, -3, -2, 1, 2, 3, 5 return Pair(-3, 3)`() {
        sumZero(listOf(-4, -3, -2, 1, 2, 3, 5)) shouldBeEqualTo Pair(-3, 3)
    }

    @Test
    fun `sumZero -4, -3, -2, 1, 2, 5 return Pair(-2, 2)`() {
        sumZero(listOf(-4, -3, -2, 1, 2, 5)) shouldBeEqualTo Pair(-2, 2)
    }
}
