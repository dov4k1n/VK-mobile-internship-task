package com.dov4k1n.vkinternshiptask.data

import com.dov4k1n.vkinternshiptask.network.ProductsApiService
import com.dov4k1n.vkinternshiptask.network.ProductsResponse

interface ProductsRepository {
    suspend fun getProductsResponse(): ProductsResponse
}

class NetworkProductsRepository(
    private val productsApiService: ProductsApiService
) : ProductsRepository {
    override suspend fun getProductsResponse(): ProductsResponse = productsApiService.getProductsResponse()
}