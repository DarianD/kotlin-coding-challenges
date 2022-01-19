package com.igorwojda.string.reverse

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun reverse(str: String): String {
    //classic method
//    val revertedString = arrayListOf<String>()
//    for (element in str.lastIndex downTo 0){
//        revertedString.add(str[element].toString())
//    }
//    return revertedString.joinToString("")


    //fold right method
//    return str.foldRight(""){letter, sumLetters -> sumLetters + letter}

    //forEach with string concatenation method
    var reversedString = ""
    str.forEach {
        reversedString = it + reversedString
    }
    return reversedString
}

private class Test {
    @Test
    fun `Reverse of "abcd" is "dcba"`() {
        reverse("abcd") shouldBeEqualTo "dcba"
    }

    @Test
    fun `Reverse of "aabbccdd" is "ccbbaadd"`() {
        reverse("aabbccdd") shouldBeEqualTo "ddccbbaa"
    }
}
