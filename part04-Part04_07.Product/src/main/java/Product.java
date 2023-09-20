/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product (String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    public void printProduct(){
        System.out.println(String.format("%s, price %s, %s pcs", name, price, quantity));
    }
}
