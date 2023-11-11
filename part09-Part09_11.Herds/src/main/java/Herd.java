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

public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for (Movable organism : this.herd){
            organism.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Movable organism : this.herd){
            str += organism.toString() + "\n";
        }
        return str;
    }
}
