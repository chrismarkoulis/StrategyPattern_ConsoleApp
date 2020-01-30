/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark;

import com.chrismark.products.Tshirt;

/**
 *
 * @author chris
 */
public class MainClass {

    public static void main(String[] args) {

        Cart cart = new Cart();
        
        cart.addToCart(new Tshirt());
        cart.addToCart(new Tshirt());
        cart.addToCart(new Tshirt());
        
        cart.printCartContent();
        
        cart.paymentMenu();
        
    }

}
