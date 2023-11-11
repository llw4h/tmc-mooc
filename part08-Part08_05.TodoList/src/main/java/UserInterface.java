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
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")){
                break;
            } else if (input.equals("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            } else if (input.equals("list")){
                list.print();
            } else if (input.equals("remove")){
                System.out.print("Which one is removed? ");
                int num = Integer.valueOf(scanner.nextLine());
                list.remove(num);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
