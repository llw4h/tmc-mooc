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
import java.io.File;
import java.util.ArrayList;
import java.nio.file.Paths;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    
    public UserInterface(Scanner scanner, ArrayList<Recipe> recipes){
        this.scanner = scanner;
        this.recipes = recipes;
    }
    
    public void start(){
        System.out.print("File to read: ");
        String filePath = scanner.nextLine();
        readFile(filePath);
        System.out.println("\nCommands:\n" + "list - lists the recipes\n" + "stop - stops the program\n" + "find name - searches recipes by name\n"
        + "find cooking time - searches recipes by cooking time\n" + "find ingredient - searches recipes by ingredient\n");
        
        while (true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")){
                break;
                
            } else if (command.equals("list")){
                System.out.println("\nRecipes:");
                list();
                System.out.println("");
                
            } else if (command.equals("find name")){
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                System.out.println("\nRecipes:");
                findName(name);
                System.out.println("");
                
            } else if (command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                findCookingTime(time);
                System.out.println("");
                
            } else if (command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                findIngredient(ingredient);
                System.out.println("");
                
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
    public void findIngredient(String ingredient){
        for (Recipe r : recipes){
            for (String i : r.getIngredients()){
                if (i.equals(ingredient)){
                    System.out.println(r.toString());
                }
            }
        }
    }
    
    public void findCookingTime(int time){
        for (Recipe r : recipes){
            if (r.getCookingTime() <= time){
                System.out.println(r.toString());
            }
        }
    }
    
    public void findName(String name){
        for (Recipe r : recipes){
            if (r.getName().contains(name)){
                System.out.println(r.toString());
            }
        }
    }
    
    public void list(){
        for (Recipe r : recipes){
            System.out.println(r.toString());
        }
    }
    
    public void readFile(String filePath){
        try (Scanner scanner = new Scanner(Paths.get(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
        
                if (line.isEmpty()) {
                    continue;
                }

                ArrayList<String> parts = new ArrayList<>();
                String name = line;
                int time = Integer.valueOf(scanner.nextLine());

                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    parts.add(line);
                }

                recipes.add(new Recipe(name, time, parts));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
   }
    
}
