/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author fa22-bse-120
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Customer customer = new Customer();
        customer.registerCustomer();
        customer.login();

        // Step 2: Customer Views Products
        customer.viewProducts();
        Product product1 = new Product(1, "Laptop");
        Product product2 = new Product(2, "Phone");
        product1.displayProduct();
        product2.displayProduct();

        // Step 3: Add Products to Cart
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.viewCart();
        cart.calculateTotal();

        // Step 4: Make Payment
        Payment payment = new Payment();
        BankSystem bankSystem = new BankSystem();
        bankSystem.authenticateTransaction();
        bankSystem.processPayment();
        payment.makePayment();

        // Step 5: Delivery Confirmation
        System.out.println("Products Delivered to Customer");
    }
}
    

