package com.tuuser.chandas.models

import androidx.annotation.DrawableRes

data class Dog(
    val name: String,
    val isFavorite: Boolean,
    @DrawableRes val imageResId: Int,
    @DrawableRes val backgroundResId: Int,
    val rating: Float
)
