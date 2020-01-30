/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.strategy;

/**
 *
 * @author chris
 */
public class CashPayment implements PaymentMethod {

    public CashPayment() {
    }

    

 @Override
    public void pay(double amount) {
        System.out.println("Payment details: " + amount + "€ paid with Cash ");


    }

    
    
    }
    

