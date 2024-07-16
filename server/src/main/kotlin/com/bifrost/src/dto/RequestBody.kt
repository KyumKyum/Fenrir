package com.bifrost.src.dto

import com.bifrost.src.constants.Material
import kotlinx.serialization.Serializable

@Serializable
abstract class RequestBody(
    val dir: String,
    val material: Material,
)

