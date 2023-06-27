package com.ramaa.finalprojectmypokedex.data.remote.responses

data class Attack(
    val cost: List<String>,
    val damage: Int,
    val effect: String,
    val name: String
)