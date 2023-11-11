/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class CD implements Packable{
    private String artist;
    private String title;
    private int publicationYear;
    private double weight;
    
    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.publicationYear = year;
        this.weight = 0.1;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s (%d)", this.artist, this.title, this.publicationYear);
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        
        if (!(obj instanceof CD)){
            return false;
        }
        
        CD comparedObj = (CD) obj;
        
        if (this.artist.equals(comparedObj.artist) && this.title.equals(comparedObj.title) && this.publicationYear == comparedObj.publicationYear){
            return true;
        }
        
        return false;
    }
    
    @Override
    public int hashCode(){
        return this.publicationYear + this.title.hashCode() + this.artist.hashCode();
    }
}
