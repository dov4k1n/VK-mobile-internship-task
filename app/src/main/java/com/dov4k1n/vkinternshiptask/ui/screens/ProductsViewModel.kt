package com.dov4k1n.vkinternshiptask.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dov4k1n.vkinternshiptask.network.ProductsApi
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface ProductsUiState {
    data class Success(val products: String) : ProductsUiState
    object Error: ProductsUiState
    object Loading: ProductsUiState
}

class ProductsViewModel : ViewModel() {
    var productsUiState: ProductsUiState by mutableStateOf(ProductsUiState.Loading)
        private set

    init {
        getProducts()
    }

    fun getProducts() {
        viewModelScope.launch {
            productsUiState = try {
                val productsResponse = ProductsApi.retrofitService.getProductsList()
                val listResult = productsResponse.products
                ProductsUiState.Success(
                    "Success: ${listResult.size} products retrieved"
                )
            }
            catch (e: IOException) {
                ProductsUiState.Error
            }
        }
    }
}