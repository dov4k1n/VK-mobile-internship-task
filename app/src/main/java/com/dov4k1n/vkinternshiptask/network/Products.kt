package com.dov4k1n.vkinternshiptask.network

data class ProductsResponse(
    val products: List<Products>,
    val total: Int,
    val skip: Boolean,
    val limit: Int
)

data class Products(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val discountPercentage: Double,
    val rating: Double,
    val stock: Int,
    val brand: String,
    val category: String,
    val thumbnail: String,
    val images: List<String>
)
