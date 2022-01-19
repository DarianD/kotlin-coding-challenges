package com.igorwojda.string.hasrepeatedcharacter

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun hasRepeatedChar(str: String): Boolean {
    var a = str.groupingBy { it }.eachCount()
    for ( i in a.keys){
        if (a[i]!!>1){
            return true
        }
    }
    return false
}

private class Test {
    @Test
    fun `"abc" don't have repeated character`() {
        hasRepeatedChar("abc") shouldBeEqualTo false
    }

    @Test
    fun `"aabc" has repeated character`() {
        hasRepeatedChar("aabc") shouldBeEqualTo true
    }

    @Test
    fun `"aabcc" has repeated character`() {
        hasRepeatedChar("aabcc") shouldBeEqualTo true
    }
}
