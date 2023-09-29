/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
    
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedObject = (Archive)compared;
        
        return identifier.equals(comparedObject.getIdentifier());
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s", identifier, name);
    }
    
}
