package com.bilalberekgm.unittest

object HomeWork {

        fun fib(number: Int): Long {
            if(number == 1 || number == 2){
                return number.toLong()
            }
            var a = 0L
            var b = 1L
            var c = 1L

            (1..(number)).forEach {
                c = a + b
                a = b
                b = c
            }
            return c
        }

        fun checkBraces(word: String): Boolean{
            word.toCharArray().forEach {
                if(it == ')'){
                    return false
                }
            }
            return word.count { it == '(' } == word.count{ it == ')'}
        }
    }
