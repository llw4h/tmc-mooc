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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            
            if (input.equals("add")){
                this.add();
                continue;
            }
            
            if (input.equals("search")){
                this.search();
                continue;
            }

            System.out.println("Unknown command");
        }
    }
    
    public void add(){
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void search(){
        System.out.print("To be translated: ");
        String translated = this.scanner.nextLine();
        if (this.dictionary.translate(translated) == null){
            System.out.println(String.format("Word %s was not found", translated));                 
        } else {
            System.out.println(String.format("Translation: %s", this.dictionary.translate(translated)));
        }
    }
}
