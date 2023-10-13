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
    private JokeManager manager;
    
    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                add();
            } else if (command.equals("2")) {
                draw();
            } else if (command.equals("3")) {
                print();
            } else {
                System.out.println("unknown command");
            }
        }
    }
    
    public void add(){
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.manager.addJoke(joke);
    }
    
    public void draw(){
        System.out.println("Drawing a joke.");
        System.out.println(this.manager.drawJoke());;
    }
    
    public void print(){
        System.out.println("Printing the jokes.");
        this.manager.printJokes();
    }
}
