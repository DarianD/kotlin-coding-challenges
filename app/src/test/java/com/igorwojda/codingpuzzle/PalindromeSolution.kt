package com.igorwojda.codingpuzzle

//string reverse
private fun palindromeSolution1(str: String): Boolean {
    return str == str.reversed()
}

//iterative, double pointer solution
private fun palindromeSolution2(str: String): Boolean {
    str.forEachIndexed { index, char ->
        val rightIndex = str.length - index - 1

        if(char != str[rightIndex])
            return false

        if(index > rightIndex)
            return true
    }

    return true
}

//recursive solution
private fun palindrome(str: String): Boolean {
    return if(str.isEmpty() || str.length == 1) {
        true
    } else {
        if(str.first() == str.last()) {
            palindrome(str.substring(1 until str.lastIndex))
        } else {
            false
        }
    }
}

//not working, because kotlin does not have allIndexed - equivalent of Array.prototype.every()
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/every
//private fun palindrome(str: String): Boolean {
//    return str.allIndexed { index, char ->
//        char == str[str.length - index - 1]
//    }
//}
