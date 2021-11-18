package com.axis.service

import com.axis.dao.IProductDao
import com.axis.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService(@Autowired val dao: IProductDao):IProductService{

    override fun addProduct(product: Product) {
    dao.save(product)
    }

    override fun getAllProduct(): List<Product> {
        return dao.findAll()
    }
}
