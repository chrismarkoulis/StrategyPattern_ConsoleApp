/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.products;

import com.chrismark.enums.Fabric;
import com.chrismark.enums.Color;
import com.chrismark.enums.Size;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author chris
 */
public class Tshirt {

    private Color color;
    private Size size;
    private Fabric fabric;
    private String name;
    private double price;
    private static String[] names;

    
    
    static{
        names = new String []{"Aloha", "Baseball", "Camp",
            "Epaulette", "Lumberjack", "Granddad", "Golf",
            "Henley", "Polo", "Tuxedo", "Tunic", "Sweatshirt"};
    }
    
    
    
   

    public Tshirt() {

        this.name = randomName();
        this.color= randomColor();
        this.size= randomSize();
        this.fabric = randomFabric();
        this.price = calculatePrice();
    }

    public Tshirt(Color color, Size size, Fabric fabric, String name, double price) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        this.name = name;
        this.price = calculatePrice();
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.color);
        hash = 47 * hash + Objects.hashCode(this.size);
        hash = 47 * hash + Objects.hashCode(this.fabric);
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tshirt other = (Tshirt) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.fabric != other.fabric) {
            return false;
        }
        return true;
    }

    
    private String randomName(){
     Random random = new Random();
    
    return names[random.nextInt(names.length)];
    
    }
        
    private Size randomSize() {

        Random random = new Random();

        int choice = random.nextInt(Size.values().length);
        return Size.values()[choice];
    }

    private Color randomColor() {

        Random random = new Random();

        int choice = random.nextInt(Color.values().length);
        return Color.values()[choice];
    }

    private Fabric randomFabric() {

        Random random = new Random();

        int choice = random.nextInt(Fabric.values().length);
        return Fabric.values()[choice];
    }
    
    
    
    private double calculatePrice(){
        double weight =0.5;
        double totalPrice = 40;
      
        totalPrice += this.size.ordinal()/weight;
        totalPrice += this.color.ordinal()/weight;
        totalPrice += this.fabric.ordinal()/weight;
        return totalPrice;
    }
  
//    private double calculatePrice2(){
//      
//        return  Double.parseDouble("" +size.ordinal() +color.ordinal() + fabric.ordinal())/(10) ;
//    }
//    
//    
//    
    
    
    
    
    
    @Override
    public String toString() {
        return " **** Tshirt details **** \n" + " color: " + color + "\n size: " + size + "\n fabric: " + fabric + "\n name: " + name + "\n price: " + price + "\n";
    }

    
    
    
    
    
    
}
