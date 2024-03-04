package com.bilalberekgm.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationObjectTest{

    @Test
    fun user_name_empty_return_false(){
        val result = RegistrationObject.controlUserInfo(
            "",
            password = "123",
            repeatPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun correctly_repeated_password_and_valid_username(){
        val result = RegistrationObject.controlUserInfo(
            "Carol",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun username_already_exist_return_false(){
        val result = RegistrationObject.controlUserInfo(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun empty_password_return_false(){
        val result = RegistrationObject.controlUserInfo(
            "Dick",
            password = "",
            repeatPassword = ""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun less_than_two_digit_password_return_false(){
        val result = RegistrationObject.controlUserInfo(
            "Derrick",
            "1wrehuef",
            "1wrehuef"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun password_do_not_repeated_correctly(){
        val result = RegistrationObject.controlUserInfo(
            "Dick",
            password = "",
            repeatPassword = ""
        )
        assertThat(result).isFalse()
    }

}