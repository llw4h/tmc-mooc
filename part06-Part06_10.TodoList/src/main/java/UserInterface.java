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
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            } else {
                processCommand(command);
            }   
        }
    }
    
    public void processCommand(String command){
         if (command.equals("add")){
            this.add();
        } else if (command.equals("list")){
            this.list();
        } else if (command.equals("remove")){
            this.remove();
        } else {
             System.out.println("no such command");
        }
    }
    
    public void add(){
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        this.list.add(task);
    }
    
    public void list(){
        this.list.print();
    }
    
    public void remove(){
        System.out.print("Which one is removed? ");
        int removing = Integer.valueOf(this.scanner.nextLine());
        this.list.remove(removing);
    }
    
}
