package com.example.retrofitkotlincoroutines.model

import androidx.annotation.Keep

@Keep
data class Company(
    val name: String,
    val catchPhrase: String, val bs: String
)