package com.github.michellebritoo.simplevalidation.input.patterns

import android.util.Patterns

class CheckInputs {
    companion object{
        private val emailPattern = Patterns.EMAIL_ADDRESS

        fun isValidEmail(email: String) : Boolean = email.isNotBlank() && emailPattern.matcher(email).matches()
    }
}