
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry(){
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (owners.getOrDefault(licensePlate, "").isBlank()){
            owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        if (!(owners.containsKey(licensePlate))){
            return null;
        }
        return owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (!(owners.containsKey(licensePlate))){
            return false;
        }
        owners.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for (LicensePlate l : owners.keySet()){
            System.out.println(l);
        }
    }
    
    public void printOwners(){
        ArrayList<String> printedOwners = new ArrayList<>();
        for (String o : this.owners.values()){
            if (!(printedOwners.contains(o))){
                printedOwners.add(o);
                System.out.println(o);
            }
        }
    }
    
}
