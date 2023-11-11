/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
import java.util.ArrayList;

public class Box implements Packable{
    private double maximumCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item){
        if (this.maximumCapacity >= this.weight() + item.weight()){
            this.items.add(item);
        }
    }
    
    @Override
    public double weight(){
        double weight = 0;
        for (Packable item : this.items){
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return String.format("Box: %d items, total weight %,.1f kg", this.items.size(), this.weight());
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        
        if (!(obj instanceof Box)){
            return false;
        }
        
        Box comparedObj = (Box) obj;
        
        if (this.maximumCapacity == comparedObj.maximumCapacity && this.items.equals(comparedObj.items)){
            return true;
        }
        
        return false;
    }
    
    @Override
    public int hashCode(){
        int result = 1;
        int prime = 11;
        
        result *= prime * this.maximumCapacity;
        result *= prime * this.items.hashCode();
        return result;
    }
}
