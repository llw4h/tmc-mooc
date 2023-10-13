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

public class Stack {
    ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (list.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.list.add(0, value);
    }
    
    public ArrayList<String> values(){
        return this.list;
    }
    
    public String take(){
        String x = this.list.get(0);
        this.list.remove(0);
        return x;
    }
}
