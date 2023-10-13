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
    private Container first;
    private Container second;
    
    public UserInterface(Container first, Container second, Scanner scanner){
        this.first = first;
        this.scanner = scanner;
        this.second = second;
    }
    
    
    public void start(){
        while (true){
            System.out.print(String.format("First: %d/100\nSecond: %d/100\n", first.contains(), second.contains()));
            String input = scanner.nextLine();
            System.out.println("");
            if (input.equals("quit")){
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                first.add(amount);
            } else if (command.equals("remove")){
                second.remove(amount);
            } else if (command.equals("move")){
                if (amount > first.contains()){
                    amount = first.contains();
                }
                second.add(amount);
                first.remove(amount);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
