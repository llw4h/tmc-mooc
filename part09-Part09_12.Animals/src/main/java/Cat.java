/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class Cat extends Animal implements NoiseCapable{
    
    public Cat(){
        super("Cat");
    }
    
    public Cat(String name){
        super(name);
    }
    
    public void purr(){
        System.out.println(String.format("%s purrs", super.getName()));
    }
    
    @Override
    public void makeNoise(){
        purr();
    }
}
