package com.axis.service
import com.axis.model.Product



interface IProductService {
    fun addProduct(product: Product)
    fun getAllProduct():List<Product>
}
