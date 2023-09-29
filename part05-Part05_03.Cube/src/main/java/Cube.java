/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class Cube {
    private int edgeLength;
    
    public Cube (int edgeLength){
        this.edgeLength = edgeLength;
    }
    
    public int volume(){
        return (int)Math.pow(edgeLength, 3);
    }
    
    public String toString(){
        return String.format("The length of the edge is %s and the volume %s", edgeLength, volume());
    }
}
