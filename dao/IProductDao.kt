package com.axis.dao

import com.axis.model.Product
import org.springframework.data.mongodb.repository.MongoRepository



interface IProductDao: MongoRepository<Product,Int> {
}
