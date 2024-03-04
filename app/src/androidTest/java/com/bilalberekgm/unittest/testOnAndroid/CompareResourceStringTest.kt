package com.bilalberekgm.unittest.testOnAndroid

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.bilalberekgm.unittest.R
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class CompareResourceStringTest(){
    val appContext = ApplicationProvider.getApplicationContext<Context>()
    /**
     * This declaring global instance for all test cases is pretty wrong approach. Because we do not
     * want to from test cases  has an effect on each other so how can solve it first approach;
     * "declare an different instance for every single test cases" this will work but our code get longer
     * second approach is use @before annotation with this the action in the @before case is occur
     * re before  for every single test cases.
     */
    private lateinit var compare: CompareResourceString
    @Before
    fun setUp(){
         compare = CompareResourceString()
    }

    @After
   fun tearDown(){
        //this annotation is used to close resources.
    }

    @Test
    fun resource_string_is_equal_to_entered_word_return_true(){
       val result = compare.controlResourceWordIsEqual(appContext, R.string.app_name, "Unit Test")
        assertThat(result).isTrue()
    }
    @Test
    fun resource_string_is_not_equal_to_entered_word_return_false(){
        val result = compare.controlResourceWordIsEqual(appContext, R.string.app_name, "Unit")
        assertThat(result).isFalse()
    }
}