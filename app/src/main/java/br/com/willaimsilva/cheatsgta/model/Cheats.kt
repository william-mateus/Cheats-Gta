package br.com.willaimsilva.cheatsgta.model

import androidx.annotation.DrawableRes

data class Cheats(
    val name: String,
    val cheats: String,
    val description: String?,
    @DrawableRes val photo: Int
)
