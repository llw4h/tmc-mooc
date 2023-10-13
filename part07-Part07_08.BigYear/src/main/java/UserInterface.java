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
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner, ArrayList<Bird> birds){
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start(){
        while (true){
            System.out.print("? ");
            String command = scanner.nextLine();
            command = command.toUpperCase();

            if (command.equals("QUIT")){
                break;
                
            } else if (command.equals("ADD")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scanner.nextLine();
                add(name, nameLatin);
             
            } else if (command.equals("OBSERVATION")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                observation(bird);
                
            } else if (command.equals("ALL")){
                printAll();
                
            } else if (command.equals("ONE")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                printOne(bird);
                
            } else {
                System.out.println("Unknown command");
            }
        } 
    }
    
    public void printOne(String bird){
        for (Bird b : birds){
            if (b.getName().equals(bird)){
                System.out.println(b.toString());
            }
        }
    }
    
    public void printAll(){
        for (Bird b : birds){
            System.out.println(b.toString());;
        }
    }
            
    public void observation(String bird){
        boolean found = false;
        for (Bird b : birds){
            if (b.getName().equals(bird)){
                b.addObservation();
                found = true;
            }
        }
        if (!found){
            System.out.println("Not a bird!");
        }
    }
    
    public void add(String name, String latinName){
        birds.add(new Bird(name, latinName));
    }
}
