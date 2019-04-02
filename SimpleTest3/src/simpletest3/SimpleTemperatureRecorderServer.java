/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest3;

import java.util.ArrayList;

/**
 *
 * @author Luciferishie
 */
public class SimpleTemperatureRecorderServer {
    
    ArrayList temperatures = new ArrayList();
    
    public boolean isConnected(){
        System.out.println("[SERVER] - Connection is being Tested");
        return true;
    }
    
    public int addInteger(int a,int b){
        return a+b;
    }
    
    public void addTemperature(double sample){
        temperatures.add(sample);
        System.out.println("[SERVER] - " + temperatures );
    }
    
    public double getColdestTemperature(){
        double min = (double) temperatures.get(0);
        for(int index = 0; index<temperatures.size();index++){
            if(min>(double) temperatures.get(index)){
                min=(double) temperatures.get(index);
            }
        }
        return min;
    }
    
}
