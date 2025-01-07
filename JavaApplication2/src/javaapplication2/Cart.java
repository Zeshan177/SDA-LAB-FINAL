/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa22-bse-120
 */
class Cart {
    private List<Product> products = new ArrayList<>();
    private float totalPrice = 0;

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product + " added to cart.");
    }

    public void viewCart() {
        System.out.println("Cart contains:");
        for (Product product : products) {
            product.displayProduct();
        }
    }

    public void calculateTotal() {
        totalPrice = products.size() * 100; // Example price calculation
        System.out.println("Total Price: " + totalPrice);
    }
}