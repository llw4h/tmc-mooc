/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class Literacy implements Comparable<Literacy>{
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;
    
    public Literacy(String gender, String country, int year, double literacyPercent){
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    public int getYear() {
        return year;
    }
    
    @Override
    public String toString(){
        return this.country + " (" + this.year+ "), " + this.gender + ", " + this.literacyPercent;
    }
    
    @Override
    public int compareTo(Literacy literacy){
        if (this.literacyPercent == literacy.getLiteracyPercent()) {
            return 0;
        } else if (this.literacyPercent > literacy.getLiteracyPercent()) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
