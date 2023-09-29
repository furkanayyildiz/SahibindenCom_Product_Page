package com.example.sahibindencomproductlisting.data.datasource

import com.example.sahibindencomproductlisting.data.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductDataStorage {

    suspend fun addProductsToList() : List<Product> = withContext(Dispatchers.IO) {
        val productList = ArrayList<Product>()

        val p1 = Product(1, " Mercedes C 180", "Kadikoy, Istanbul", 1500000, "c180_view")
        val p2 = Product(2, "Doktordan Temiz 2018 model Mercedes C 180", "Besiktas, Istanbul", 2546000, "c180_view")
        val p3 = Product(3, "Doktordan Temiz 2018 model Mercedes C 180", "Alanya, Antalya", 1500000, "c180_view")

        productList.add(p1)
        productList.add(p2)
        productList.add(p3)

        return@withContext productList
    }
}