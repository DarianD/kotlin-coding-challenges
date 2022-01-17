package com.igorwojda.list.product

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun product(list: List<Int>): Int {
//    var result = 1
//    for(item in list){
//        result *= item
//    }
//    return result
//    return list.fold(1) { sum, element -> sum * element }
    return list.reduce { sum, element -> sum * element }
}

private class Test {
    @Test
    fun `product 0 returns 0`() {
        product(listOf(0)) shouldBeEqualTo 0
    }

    @Test
    fun `product 1, 2, 3 returns 6`() {
        product(listOf(1, 2, 3)) shouldBeEqualTo 6
    }

    @Test
    fun `product 4, 2, 10 returns 80`() {
        product(listOf(2, 4, 10)) shouldBeEqualTo 80
    }
}
