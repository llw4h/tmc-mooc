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

public class Points {
    private ArrayList<Integer> points;
    
    public Points(){
        this.points = new ArrayList<>();
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void add(int num) {
        if (num >= 0 && num <= 100){
            this.points.add(num);
        }
    }
    
    public int total(){
        return this.points.size();
    }
    
    public boolean isEmpty(){
        return this.points.isEmpty();
    }
    
    public ArrayList<Integer> getPassing(){
        ArrayList<Integer> passing = new ArrayList<>();
        for (int p : points){
            if (p >= 50){
                passing.add(p);
            }
        }
        return passing;
    }
    
}
