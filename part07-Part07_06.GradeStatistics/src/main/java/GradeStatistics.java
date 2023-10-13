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
import java.util.Arrays;

public class GradeStatistics {
    private Points points;
    
    public GradeStatistics(){
        this.points = new Points();
    }

    public ArrayList<Integer> getPoints() {
        return this.points.getPoints();
    }       
            
    public void add(int num){
        this.points.add(num);
    }
    
    public int sum(ArrayList<Integer> points){
        int sum = 0;
        if (this.points.isEmpty()){
            return sum;
        }
        for (int p : points){
            sum += p;
        }
        return sum;
    }
    
    public double average(){
        return 1.0 * sum(this.points.getPoints()) / this.points.total();
    }
    
    public double averagePassing(){
        if (this.points.getPassing().isEmpty()){
            return -1;
        }
        return 1.0 * sum(this.points.getPassing()) / this.points.getPassing().size();
    }
    
    public double passPercentage(){
        return 100 * 1.0 * this.points.getPassing().size() / this.points.total();
    }
    
    public void printGradeDistribution(){
        int[] grades = gradeDistribution();
        for (int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            printStars(grades[i]);
            System.out.println("");
        }
    }
    
    public int[] gradeDistribution(){
        int[] grades = {0, 0, 0, 0, 0, 0};
        grades[0] = this.points.total() - this.points.getPassing().size();
        for (int p : this.points.getPassing()){
            if (p < 60){
                grades[1]++;
            } else if (p < 70){
                grades[2]++;
            } else if (p < 80){
                grades[3]++;
            } else if (p < 90){
                grades[4]++;
            } else {
                grades[5]++;
            }
        }
        return grades;
    }
    
    private void printStars(int num){
        for (int i = 0; i < num; i++){
            System.out.print("*");
        }
    }
}
