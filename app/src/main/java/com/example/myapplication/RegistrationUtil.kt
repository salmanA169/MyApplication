package com.example.myapplication

object RegistrationUtil {

        private val existingUsers = listOf("Peter","Carl")
    /**
     * the input is not valid if..
     * ...the username/password is empty
     * ...the username is taken
     * ...the confirmedPassword is not the same as the real password
     * ...the password contains less then 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {

        username.count {
            it.isDigit()
        }
        return true
    }


}