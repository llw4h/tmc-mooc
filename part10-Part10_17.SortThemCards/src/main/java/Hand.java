/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        Iterator<Card> iterator = hand.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public int sum(){
        return this.hand.stream()
                .map(hand -> hand.getValue())
                .reduce(0, (previousSum, value) -> previousSum + value);
    }
    
    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand hand){
        return this.sum() - hand.sum();
    }
    
}
