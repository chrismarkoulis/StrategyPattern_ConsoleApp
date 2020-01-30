/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark;

import com.chrismark.products.Tshirt;
import com.chrismark.strategy.BankTransferPayment;
import com.chrismark.strategy.CashPayment;
import com.chrismark.strategy.CreditCardPayment;
import com.chrismark.strategy.PaymentMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Cart {

    private List<Tshirt> products;
    PaymentMethod method;

    private double cartTotalCost;

    public Cart() {
        products = new ArrayList();
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    
    
//    
//    public void PaymentMethod(double price) {
//
//        if (price < 50) {
//
//            PaymentMethod paymentMethod = new CashPayment();
//            paymentMethod.pay(price);
//            
//        } else if (price < 150) {
//            
//            PaymentMethod paymentMethod = new CreditCardPayment("Visa", "165161321", "123", 2020);
//            paymentMethod.pay(price);
//
//        } else {
//            PaymentMethod paymentMethod = new BankTransferPayment("Ethnikh", "1dfdfd648");
//            paymentMethod.pay(price);
//            
//
//        }
//    }
    public void addToCart(Tshirt tshirt) {
        products.add(tshirt);
    }

//    public void fillCart(int noOfProducts) {
//
//        for (int i = 0; i < noOfProducts; i++) {
//            products.add(new Tshirt());
//        }
//
//    }

    public double calculateCartCost() {
        cartTotalCost = 0;
        for (Tshirt s : products) {
            cartTotalCost += s.getPrice();
        }
        return cartTotalCost;
    }

    
    public void checkout(){
        method.pay(cartTotalCost);
        
    }
    
    public void printCartContent(){
        for (Tshirt s: products) {
            System.out.println(s);
        }
    
    }
    
    public void paymentMenu(){
    
        System.out.println("Total cost is: " + calculateCartCost() + "€");  

        PaymentMethod payment = null;
        Scanner s = new Scanner(System.in);
        System.out.println("How would you like to pay?");
        System.out.println("1. Credit Card");
        System.out.println("2. Bank transfer");
        System.out.println("3. Cash");
        int choice = s.nextInt();
        switch (choice) {

            case 1:
                payment = new CreditCardPayment("Visa", "165161321", "1231234", 2020);
                break;
            case 2:
                payment = new BankTransferPayment("NBG", "AE058908979");
                break;
            case 3:
                payment = new CashPayment();
                break;
        }
        
        setMethod(payment);
        checkout();
    
    }
    
}
