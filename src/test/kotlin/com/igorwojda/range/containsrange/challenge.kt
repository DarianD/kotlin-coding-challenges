package com.igorwojda.range.containsrange

import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldContainAll
import org.junit.jupiter.api.Test

private fun containsRange(range1: IntRange, range2: IntRange): Boolean{
//    val listaRange1 = range1.distinct() as Set<Int>
//    val listaRange2 = range2.distinct() as Set<Int>
//    if (listaRange1.contains(listaRange2)) {
//        return true
//    }
//    else {
//        return false
//    }
//    if (listaRange1.contains(listaRange2)) {
//        return true
//    }
//    else {
//        return false
//    }
    return true
}

private class Test {
    @Test
    fun `5-7 range contains 5-7`() {
        containsRange(5..7, 5..7) shouldBeEqualTo true
    }

    @Test
    fun `1-12 range contains 5-7`() {
        containsRange(1..12, 5..7) shouldBeEqualTo true
    }

    @Test
    fun `12-17 range contains 12-14`() {
        containsRange(12..17, 12..14) shouldBeEqualTo true
    }

    @Test
    fun `12-17 range contains 15-17`() {
        containsRange(12..17, 15..17) shouldBeEqualTo true
    }

    @Test
    fun `5-7 range contains 1-12`() {
        containsRange(5..7, 1..12) shouldBeEqualTo false
    }

    @Test
    fun `5-8 range contains 5-9`() {
        containsRange(5..8, 5..9) shouldBeEqualTo false
    }

    @Test
    fun `5-8 range contains 3-5`() {
        containsRange(5..8, 3..5) shouldBeEqualTo false
    }
}
