package com.example.myapplication

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Test


class ResourceComparerTest{
    private val resourceComparer = ResourceComparer()

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context =  ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"My Application")
        assertThat(result).isTrue()
    }

}