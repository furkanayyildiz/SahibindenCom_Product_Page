package com.example.sahibindencomproductlisting.data.repository

import com.example.sahibindencomproductlisting.data.datasource.ProductDataStorage
import com.example.sahibindencomproductlisting.data.model.Product

class ProductRepository {
    var productDataStorage = ProductDataStorage()

    suspend fun addProductsToList() : List<Product> = productDataStorage.addProductsToList()

    suspend fun productListSize() : String = productDataStorage.productListSize()
}