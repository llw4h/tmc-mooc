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

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if (item.getWeight() <= this.maximumWeight){
            this.items.add(item);
            this.maximumWeight -= item.getWeight();
        }
    }
    
    public void printItems(){
        for (Item i : this.items){
            System.out.println(String.format("%s (%s kg)", i.getName(), i.getWeight()));
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Item i : this.items){
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
    
    @Override
    public String toString(){
        if (this.items.isEmpty()){
            return "no items (0 kg)";
        }
        if (this.items.size() == 1){
            return String.format("1 item (%s kg)", this.items.get(0).getWeight());
        }
        return String.format("%s items (%s kg)", this.items.size(), this.totalWeight());
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item i : this.items){
            if (i.getWeight() > heaviest.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
    }
}
