package com.dov4k1n.vkinternshiptask.data

import com.dov4k1n.vkinternshiptask.network.ProductsApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val productsRepository: ProductsRepository
}

class DefaultAppContainer : AppContainer {
    private val baseUrl = "https://dummyjson.com"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseUrl)
        .build()

    private val retrofitService: ProductsApiService by lazy {
        retrofit.create(ProductsApiService::class.java)
    }

    override val productsRepository: ProductsRepository by lazy {
        NetworkProductsRepository(retrofitService)
    }
}