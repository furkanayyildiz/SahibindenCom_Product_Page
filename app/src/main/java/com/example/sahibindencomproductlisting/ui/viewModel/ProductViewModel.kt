package com.example.sahibindencomproductlisting.ui.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sahibindencomproductlisting.data.model.Product
import com.example.sahibindencomproductlisting.data.repository.ProductRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ProductViewModel : ViewModel() {
    var productRepository = ProductRepository()
    var productList = MutableLiveData<List<Product>>()
    var productListSize = MutableLiveData("0")
    init {
        addProductsToList()
        productListSize()
    }
    fun addProductsToList() {
        CoroutineScope(Dispatchers.Main).launch {
            productList.value = productRepository.addProductsToList()

        }
    }
    fun productListSize() {
        CoroutineScope(Dispatchers.Main).launch {
            productListSize.value = productRepository.productListSize()

        }
    }
}