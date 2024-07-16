package com.bifrost.src.dto

import com.bifrost.src.constants.Material
import kotlinx.serialization.Serializable

//@Serializable
class ImageRequestDto(dir: String, material: Material) : RequestBody(dir, material) {

}