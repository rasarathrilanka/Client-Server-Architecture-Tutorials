/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest4;

import java.util.Date;

/**
 *
 * @author Luciferishie
 */
public class DummyClient {
    DummyServer server = new DummyServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DummyClient client = new DummyClient();
        client.executeTest();
    }

    private void executeTest() {
        if(server.isConnected()){
            System.out.println("[CLIENT] - The Server is connected and Test can be processed.");
            TemperatureSample temp = new TemperatureSample();
            temp.value=10.31;
            temp.location="Matara";
            temp.date= new Date();
            System.out.println("[CLIENT] - The sample is " + " "+ temp);
            server.addSample(temp);
        }else{
            System.out.println("[CLIENT] - The Server is connected and Test has failed");
        }
    }
    
}
