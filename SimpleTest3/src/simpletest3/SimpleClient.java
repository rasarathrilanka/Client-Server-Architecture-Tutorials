/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest3;


/**
 *
 * @author Luciferishie
 */
public class SimpleClient {
    
    SimpleTemperatureRecorderServer server = new SimpleTemperatureRecorderServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleClient client = new SimpleClient();
        client.executeText();
    }

    private void executeText() {
        if(server.isConnected()){
            System.out.println("[CLIENT] - The client is connected, the test can be processed...");
            int a=2;
            int b=3;
            int sum=server.addInteger(a,b);
            server.addTemperature(10);
            server.addTemperature(1);
            server.addTemperature(12);
            System.out.println(server.getColdestTemperature());
        }
        else{
            System.out.println("[CLIENT] - The client is NOT connected, the test has failed...");
        }
        
        
    }
    
}
