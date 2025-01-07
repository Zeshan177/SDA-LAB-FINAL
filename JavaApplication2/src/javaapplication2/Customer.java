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
class Customer {
    private int customerId;
    private String name;
    private String email;

    public void registerCustomer() {
        System.out.println("Customer Registered");
    }

    public void login() {
        System.out.println("Customer Logged In");
    }

    public void viewProducts() {
        System.out.println("Viewing Available Products");
    }
}
