package com.dov4k1n.vkinternshiptask.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.dov4k1n.vkinternshiptask.ProductsApplication
import com.dov4k1n.vkinternshiptask.data.ProductsRepository
import com.dov4k1n.vkinternshiptask.network.ProductsResponse
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface ProductsUiState {
    data class Success(val productsResponse: ProductsResponse) : ProductsUiState
    object Error: ProductsUiState
    object Loading: ProductsUiState
}

class ProductsViewModel(
    private val productsRepository: ProductsRepository
) : ViewModel() {
    var productsUiState: ProductsUiState by mutableStateOf(ProductsUiState.Loading)
        private set

    init {
        getProducts()
    }

    fun getProducts() {
        viewModelScope.launch {
            productsUiState = try {
                ProductsUiState.Success(productsRepository.getProductsResponse())
            }
            catch (e: IOException) {
                ProductsUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as ProductsApplication)
                val productsRepository = application.container.productsRepository
                ProductsViewModel(productsRepository = productsRepository)
            }
        }
    }
}