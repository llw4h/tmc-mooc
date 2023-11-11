/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class OneItemBox extends Box{
    private Item item;
    private boolean hasItem;
    
    public OneItemBox(){
        this.hasItem = false;
    }
    
    @Override
    public void add(Item item){
        if (this.hasItem == false){
            this.item = item;
            this.hasItem = true;
        }
        
    }
    
    @Override
    public boolean isInBox(Item item){
        if (this.item == null){
            return false;
        }
        return this.item.equals(item);
    }
}
