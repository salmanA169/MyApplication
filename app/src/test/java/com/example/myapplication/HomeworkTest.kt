package com.example.myapplication

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest{

    @Test
    fun `test fib`(){
        val fib = Homework.fib(3)
        assertThat(fib).isEqualTo(7)
    }
    @Test
    fun `test strings`(){
        val strings = Homework.checkBraces("(()")
        assertThat(strings).isTrue()
    }
}