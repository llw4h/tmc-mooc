/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class LiquidContainer {
    private String name;
    private int liters;
    
    public LiquidContainer(String name){
        this.name = name;
        this.liters = 0;
    }

    public int getLiters() {
        return liters;
    }

    public void addLiters(int liters) {
        if (liters > 0){
            this.liters += liters;
            if (this.liters > 100){
                this.liters = 100;
            }
        }
    }
    
    public void removeLiters(int liters){
        if (liters > 0){
            this.liters -= liters;
            if (this.liters < 0){
                this.liters = 0;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %d/100", this.name, this.liters);
    }
    
    
}
