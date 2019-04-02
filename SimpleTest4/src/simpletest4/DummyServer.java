/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest4;

import java.util.ArrayList;

/**
 *
 * @author Luciferishie
 */
public class DummyServer {
    ArrayList<TemperatureSample> samples = new ArrayList<TemperatureSample>();
    
    public boolean isConnected(){
        System.out.println("[SERVER] - Testing if server is connected...");
        return true;
    }
    
    public void addSample(TemperatureSample s){
        System.out.println("{SERVER] - Adding "+s+"to"+samples);
        samples.add(s);
        System.out.println("{SERVER] -Samples are "+samples);
    }
}
