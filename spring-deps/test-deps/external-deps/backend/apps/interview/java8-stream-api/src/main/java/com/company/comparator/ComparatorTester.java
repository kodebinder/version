package com.company.comparator;

import com.company.Product;
import com.company.ProductDatabase;

import java.util.Comparator;
import java.util.List;

public class ComparatorTester {
    public static void main(String[] args) {

        ProductDatabase productDatabase = new ProductDatabase();
        List<Product> products = productDatabase.getProducts();

        Product productWithLowestPrice = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .findFirst()
                .get();
        System.out.println("ProductWithLowestPrice: " + productWithLowestPrice);

        Product productWithHighestPrice = products.stream()
                .sorted((e1, e2) -> Double.compare(e2.getPrice(), e1.getPrice()))
                .findFirst()
                .get();
        System.out.println("ProductWithHighestPrice: " + productWithHighestPrice);

        Product productWithHighestId = products.stream()
                .sorted(Comparator.comparingInt(Product::getId).reversed())
                .findFirst()
                .get();
        System.out.println("productWithHighestId: " + productWithHighestId);

    }
}
