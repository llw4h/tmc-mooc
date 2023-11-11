/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
import java.util.*;

public class Warehouse {
    private Map<String, Integer> itemPrice;
    private Map<String, Integer> itemStock;
    
    public Warehouse(){
        this.itemPrice = new HashMap<>();
        this.itemStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.itemPrice.putIfAbsent(product, price);
        this.itemStock.putIfAbsent(product, stock);
    }
    
    public int price(String product){
        if (!this.itemPrice.containsKey(product)){
            return -99;
        }
        return this.itemPrice.get(product);
    }
    
    public int stock(String product){
        return this.itemStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(this.itemStock.containsKey(product) && this.itemStock.get(product) > 0 ){
            this.itemStock.put(product, this.itemStock.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> productNames = new HashSet<>();
        for (String name : this.itemPrice.keySet()){
            productNames.add(name);
        }
        return productNames;
    }
}
