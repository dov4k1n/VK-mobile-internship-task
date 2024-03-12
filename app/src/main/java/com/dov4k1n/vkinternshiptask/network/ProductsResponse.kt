package com.dov4k1n.vkinternshiptask.network

import kotlinx.serialization.Serializable

@Serializable
data class ProductsResponse(
    val products: List<Products>,
    val total: Int,
    val skip: Int,
    val limit: Int
)
