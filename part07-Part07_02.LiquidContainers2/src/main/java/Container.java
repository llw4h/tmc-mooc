/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class Container {
    private int liters;
    
    public Container(){
        this.liters = 0;
    }
    
    public int contains(){
        return liters;
    }
    
    public void add(int amount){
        if (!isNegative(amount)){
            liters += amount;
        }
        if (liters > 100){
            liters = 100;
        }
    }
    
    public void remove(int amount){
        if (!isNegative(amount)){
            liters -= amount;
        }
        if (liters < 0){
            liters = 0;
        }
    }
    
    public String toString(){
        return liters + "/100";
    }
    
    public boolean isNegative(int amount){
        return amount < 0;
    }
}
