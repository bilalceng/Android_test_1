package com.bilalberekgm.unittest

import com.bilalberekgm.unittest.testOnJvm.HomeWork
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeWorkTest{
    @Test
    fun is_fib_function_give_correct_result(){
        val expectedResult = 13
        val result = HomeWork.fib(6)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun is_fib_one_and_two_is_correct(){
        val expectedResultIsOne = 1
        val expectedResultIsTwo = 2

        val resultOne = HomeWork.fib(1)
        val resultTwo = HomeWork.fib(2)

        assertThat(expectedResultIsOne).isEqualTo(resultOne)
        assertThat(expectedResultIsTwo).isEqualTo(resultTwo)

    }
    @Test
    fun brackets_not_balanced(){
        val word = "((word)))"
        val expectedBoolean = false
        val result = HomeWork.checkBraces(word)
        assertThat(result).isEqualTo(expectedBoolean)
    }

    @Test
    fun brackets_balanced(){
        val word = "((word))"
        val expectedBoolean = true
        val result = HomeWork.checkBraces(word)
        assertThat(result).isEqualTo(expectedBoolean)
    }

    @Test
    fun first_bracket_closed_return_false(){
        val word = ")(word))"
        val expectedBoolean = false
        val result = HomeWork.checkBraces(word)
        assertThat(result).isEqualTo(expectedBoolean)
    }
}