package com.axis.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "product_kotlin")
data class Product (@Id val id:Int, var name:String, var category: String, var price:Double)
