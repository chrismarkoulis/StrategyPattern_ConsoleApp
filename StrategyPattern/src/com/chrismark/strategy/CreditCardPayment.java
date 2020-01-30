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
public class CreditCardPayment implements PaymentMethod {

    private String cardType; //MasterCard, Visa, Maestro
    private String cardNumber;
    private String cvv;
    private int expirationYear;

    public CreditCardPayment(String cardType, String cardNumber, String cvv, int expirationYear) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationYear = expirationYear;
    }
    
    
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid amount: " + amount + "€" + " with details:\n " + this);


    }

    
    @Override
    public String toString() {
        return "CardType: " + cardType + " | cardNumber: " + cardNumber + " | cvv: " + cvv + " | expirationYear: " + expirationYear;
    }
    
    
    
    
    
}
