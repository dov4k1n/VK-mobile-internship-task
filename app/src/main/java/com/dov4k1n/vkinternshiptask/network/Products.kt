package com.dov4k1n.vkinternshiptask.network

import kotlinx.serialization.Serializable

@Serializable
data class Products(
    val id: Int,
    val title: String,
    val description: String,
    val price: Int,
    val discountPercentage: Double,
    val rating: Double,
    val stock: Int,
    val brand: String,
    val category: String,
    val thumbnail: String,
    val images: List<String>
)