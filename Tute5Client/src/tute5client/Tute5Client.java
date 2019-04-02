/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tute5client;

/**
 *
 * @author Luciferishie
 */
public class Tute5Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tute5Client client = new Tute5Client();
        client.executeTest();
    }

    private void executeTest() {
        System.out.println("[CLIENT] - Execution Test Started..");
        
        if(isConnected()){
            System.out.println("[SERVER] - is connected Test can be continued..");
        }else{
            System.out.println("[SERVER] - is NOT connected Test Failed");
        }
    }

    private static String hello(java.lang.String name) {
        tute5client.SimpleWebService_Service service = new tute5client.SimpleWebService_Service();
        tute5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.hello(name);
    }

    private static Boolean isConnected() {
        tute5client.SimpleWebService_Service service = new tute5client.SimpleWebService_Service();
        tute5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.isConnected();
    }
    
}
