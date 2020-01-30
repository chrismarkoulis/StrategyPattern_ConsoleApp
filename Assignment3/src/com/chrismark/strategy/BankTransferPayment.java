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
public class BankTransferPayment implements PaymentMethod {

    private String bankName;
    private String accountNumber;

    public BankTransferPayment(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }
    
    
    
    
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid amount: " + amount + "€" + " with details:\n " + this);


    }

    @Override
    public String toString() {
        return "Bank Name: " + bankName + " | Account Number: " + accountNumber;
    }
    
    
    
    
}
