/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeStatistics grade;
    
    public UserInterface(Scanner scanner, GradeStatistics grade){
        this.scanner = scanner;
        this.grade = grade;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1){
                break;
            } else {
                grade.add(input);
            }
        }
        
        System.out.println("Point average (all): " + grade.average());
        
        String averageOfPassing = String.valueOf(grade.averagePassing());
        if ( averageOfPassing.equals("-1.0")){
            averageOfPassing = "-";
        }
        System.out.println("Point average (passing): " + averageOfPassing);
        
        System.out.println("Pass percentage: " + grade.passPercentage());
        
        System.out.println("Grade distribution:");
        grade.printGradeDistribution();
    }
}
