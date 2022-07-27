package com.handal.domain.catfacts.model

import com.google.gson.annotations.SerializedName


data class Fact (
    @SerializedName("_id") val id: String,
    @SerializedName("text") val text:String
)


