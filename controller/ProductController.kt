package com.axis.controller

import com.axis.model.Product
import com.axis.service.IProductService
import com.axis.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/product")
class ProductController(@Autowired val service: IProductService) {


    @PostMapping("/addProduct")
    fun addProduct(@RequestBody product: Product){
        service.addProduct(product)
    }
    @GetMapping("/getAllProduct")
    fun getAllProduct():ResponseEntity<List<Product>>{
        return ResponseEntity(service.getAllProduct(), HttpStatus.OK)
    }

}
