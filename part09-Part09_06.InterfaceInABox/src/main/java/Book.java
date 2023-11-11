/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class Book implements Packable{
    private String author;
    private String title;
    private double weight;
    
    public Book(String author, String title, double weight){
        this.author = author;
        this.title = title;
        this.weight = weight;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
        
    @Override
    public String toString(){
        return String.format("%s: %s", this.author, this.title);
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        
        if (!(obj instanceof Book)){
            return false;
        }
        
        Book comparedObj = (Book) obj;
        
        if (this.author.equals(comparedObj.author) && this.title.equals(comparedObj.title)){
            return true;
        }
        
        return false;
    }
    
    @Override
    public int hashCode(){
        return this.title.hashCode() + this.author.hashCode();
    }
    
    
}
