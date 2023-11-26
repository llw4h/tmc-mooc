/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author lulwah
 */
public class TemperatureSensor implements Sensor{
    private int value;
    private boolean sensor;
    
    public TemperatureSensor(){
        this.sensor = false;
        this.value = 0;
    }
    
    @Override
    public int read(){
        if (this.sensor){
            this.value = (new Random().nextInt(61)) - 30;
            return this.value;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public boolean isOn(){
        return this.sensor;
    }
    
    @Override
    public void setOn(){
        this.sensor = true;
    }
    
    @Override
    public void setOff(){
        this.sensor = false;
    }
}
