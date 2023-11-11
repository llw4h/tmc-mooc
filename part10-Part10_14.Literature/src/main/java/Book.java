/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class Book {
    private String title;
    private int ageRecommendation;
    
    public Book(String title, int ageRecommendation){
        this.title = title;
        this.ageRecommendation = ageRecommendation;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s (recommended for %d year-olds or older)", this.title, this.ageRecommendation);
    }
    
    
    
}
