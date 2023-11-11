/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
import java.util.*;
public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        Iterator<Person> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()) {
            this.employees.add(iterator.next());
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()){
            Person currentPerson = iterator.next();
            if (currentPerson.getEducation() == education){
                iterator.remove();
            }
        }
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()){
            Person currentPerson = iterator.next();
            if (currentPerson.getEducation() == education){
                System.out.println(currentPerson.toString());
            }
        }
    }
}
