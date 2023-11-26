/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author lulwah
 */
import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    @Override
    public int read(){
        if (this.sensors.isEmpty() || !isOn()){
            throw new IllegalStateException();
        }
        double average = this.sensors.stream()
                .map(value -> value.read())
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .orElse(0.0);
        this.readings.add((int)average);
        return (int)average;
    }
    
    @Override
    public boolean isOn(){
        if ((this.sensors.stream()
                .filter(value -> value.isOn() == true)
                .count()) == this.sensors.size()){
            return true;
        }
        return false;
    }
    
    @Override
    public void setOn(){
        this.sensors.stream()
                .forEach(value -> value.setOn());
    }
    
    @Override
    public void setOff(){
        this.sensors.stream()
                .forEach(value -> value.setOff());
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}
