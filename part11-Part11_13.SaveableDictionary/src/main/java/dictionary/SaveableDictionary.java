/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author lulwah
 */
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary = new LinkedHashMap<>();
    }
    
    public SaveableDictionary(String file){
        this();
        this.file = file;
        
    }
    
    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }
    
    public String translate(String word){
        return this.dictionary.getOrDefault(word, null);
    }
    
    public void delete(String word){
        this.dictionary.remove(this.dictionary.get(word));
        this.dictionary.remove(word);
    }
    
    public boolean load(){
        try {
          Scanner scanner = new Scanner(Paths.get(this.file));
          
          while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(":");   
            this.add(parts[0], parts[1]);
           }
          
          return true;
          
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public boolean save(){
        try {
            PrintWriter writer = new PrintWriter(this.file);
            String translation = "";
            for (String word : this.dictionary.keySet()){
                if (translation.equals(word)){
                    continue;
                }
                translation = this.dictionary.get(word);
                writer.println(word + ":" + translation);
            }
            writer.close();
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
