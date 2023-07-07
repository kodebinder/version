package com.company.controller;

import com.company.entity.Product;
import com.company.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @PostMapping
    public List<Product> saveAll(@RequestBody List<Product> products) {
        return productService.saveAll(products);
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") long id) {
        return productService.findById(id);
    }

    @GetMapping("/productname/{name}")
    public List<Product> findByProductName(@PathVariable("name") String name) {
        return productService.findByProductName(name);
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/id/{id}")
    public String deleteById(@PathVariable("id") long id) {
        return productService.deleteById(id);
    }

    @DeleteMapping("/{name}")
    public List<Product> deleteByProductName(@PathVariable("name") String name) {
        return productService.deleteByProductName(name);
    }

    @DeleteMapping
    public String deleteAll() {
        return productService.deleteAll();
    }
}
