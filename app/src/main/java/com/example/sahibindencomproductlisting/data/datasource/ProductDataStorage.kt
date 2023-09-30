package com.example.sahibindencomproductlisting.data.datasource

import com.example.sahibindencomproductlisting.data.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductDataStorage {
    val productList = ArrayList<Product>()
    var listSize = "0"
    suspend fun addProductsToList() : List<Product> = withContext(Dispatchers.IO) {


        val p1 = Product(1, "Tramer Kayıtsız Mercedes C180", "Kadikoy, Istanbul", 1507000, "c180_view", false)
        val p2 = Product(2, "Galeriden 2018 model a180", "Besiktas, Istanbul", 2546000, "a180", false)
        val p3 = Product(3, "Düşük kilometre cla 200", "Alanya, Antalya", 2550700, "cla200", true)
        val p4 = Product(4, "Doktordan Temiz 60.000 km Gla", "Çeşme, İzmir", 1860500, "gla", true)
        val p5 = Product(5, "İlk sahibinden değişensiz Mercedes", "Alanya, Antalya", 1585000, "suv",false)
        val p6 = Product(6, "Cam tavan 8 ileri vitesli E250", "Çankaya, Ankara", 2750000, "e250",true)
        val p7 = Product(7, "Yeni Muayeneli 2020 model C180", "Sarıyer, Istanbul", 1677000, "c180_view", false)

        productList.add(p1)
        productList.add(p2)
        productList.add(p3)
        productList.add(p4)
        productList.add(p5)
        productList.add(p6)
        productList.add(p7)

        return@withContext productList
    }
    suspend fun productListSize() : String = withContext(Dispatchers.IO) {
         listSize =  productList.size.toString()
        return@withContext listSize
    }
}