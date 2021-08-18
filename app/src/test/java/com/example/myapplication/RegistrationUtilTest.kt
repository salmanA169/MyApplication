package com.example.myapplication

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `validate username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Salman",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

}