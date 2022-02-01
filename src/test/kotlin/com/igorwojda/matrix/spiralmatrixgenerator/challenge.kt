package com.igorwojda.matrix.spiralmatrixgenerator

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun generateSpiralMatrix(n: Int): List<MutableList<Int?>> {
    val spiral = MutableList(n) {
        MutableList<Int?>(n) { null }
    }
    var increment = 1
    var layer = 0

    while(layer < (n+1)/2){
        for(i in layer until n - layer){
            spiral[layer][i] = increment
            increment++
        }

        for(i in layer + 1 until n - layer){
            spiral[i][n - layer - 1] = increment
            increment++
        }

        for(i in layer + 1 until n - layer){
            spiral[n - layer - 1][n - i - 1] = increment
            increment++
        }

        for(i in layer + 1 until n - layer - 1){
            spiral[n - i - 1][layer] = increment
            increment++
        }

        layer++
    }

    return spiral
}

private class Test {
    @Test
    fun `generateSpiralMatrix generates a 2x2 matrix`() {
        val matrix = generateSpiralMatrix(2)
        matrix.size shouldBeEqualTo 2
        matrix[0] shouldBeEqualTo listOf(1, 2)
        matrix[1] shouldBeEqualTo listOf(4, 3)
    }

    @Test
    fun `generateSpiralMatrix generates a 3x3 matrix`() {
        val matrix = generateSpiralMatrix(3)
        matrix.size shouldBeEqualTo 3
        matrix[0] shouldBeEqualTo listOf(1, 2, 3)
        matrix[1] shouldBeEqualTo listOf(8, 9, 4)
        matrix[2] shouldBeEqualTo listOf(7, 6, 5)
    }

    @Test
    fun `generateSpiralMatrix generates a 4x4 matrix`() {
        val matrix = generateSpiralMatrix(4)
        matrix.size shouldBeEqualTo 4
        matrix[0] shouldBeEqualTo listOf(1, 2, 3, 4)
        matrix[1] shouldBeEqualTo listOf(12, 13, 14, 5)
        matrix[2] shouldBeEqualTo listOf(11, 16, 15, 6)
        matrix[3] shouldBeEqualTo listOf(10, 9, 8, 7)
    }
}
