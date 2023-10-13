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

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() <= this.maximumWeight){
            this.suitcases.add(suitcase);
            this.maximumWeight -= suitcase.totalWeight();
        }
        
    }
    
    @Override
    public String toString(){
        int totalWeight = 0;
        for (Suitcase s : this.suitcases){
            totalWeight += s.totalWeight();
        }
        if (this.suitcases.size() == 1){
            return String.format("1 suitcase (%s kg)", totalWeight);
        }
        return String.format("%s suitcases (%s kg)", this.suitcases.size(), totalWeight);
    }
    
    public void printItems(){
        for (Suitcase s : this.suitcases){
            s.printItems();
        }
    }
}
