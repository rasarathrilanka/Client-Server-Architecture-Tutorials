/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummycex1aclient;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luciferishie
 */
public class DummyCEX1AClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DummyCEX1AClient client = new DummyCEX1AClient();
        client.executeTest();
    }

    private void executeTest() {
        System.out.println("[CLIENT] - Test connection started");
        if(testConnection().equals("OK")){
            System.out.println("[CLIENT] - Server is connected. Test continued."); 
            
//            if(findMinimumBetween(3,5)== 3){
            if (findMinimumBetween(3.0, 5.0) == 3.0) {
                System.out.println("[CLIENT] - Find minimum correct result"); 
            }else{
                System.out.println("[CLIENT] - Find minimum wrong result"); 
            }
            System.out.println("Adding samples"); 
            addSample(1.0);
            addSample(3.4);
            addSample(5.0);
            addSample(7.32);
            if(findMinimumAmongSamples() == 1.0){
               System.out.println("[CLIENT] - Find minimum among samples correct result");  
            }else{
                System.out.println("[CLIENT] - Find minimum among samples wrong result"); 
            }
            
            
            try {
                if (findMinimumBetweenWithException(3.14, 2.17) == 2.17) {
                    System.out.println("[CLIENT] - findMinimumBetweenWithException, correct result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - findMinimumBetweenWithException, YOU SHOULD SEE THIS EXCEPTION");
            }
            
            try {
                if (findMinimumBetweenWithException(3.14, null) == 2.17) {
                    System.out.println("[CLIENT] - findMinimumBetweenWithException, correct result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - findMinimumBetweenWithException, YOU SHOULD SEE THIS EXCEPTION");
            }
            
             try {
                if (findMinimumBetweenWithException(null, 2.17) == 2.17) {
                    System.out.println("[CLIENT] - findMinimumBetweenWithException, correct result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - findMinimumBetweenWithException, YOU SHOULD SEE THIS EXCEPTION");
            }

            try {
                if (findMinimumBetweenWithException(null, null) == 2.17) {
                    System.out.println("[CLIENT] - findMinimumBetweenWithException, correct result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - findMinimumBetweenWithException, YOU SHOULD SEE THIS EXCEPTION");
            }

        }else{
            System.out.println("[CLIENT] - Server is NOT connected. Test failed.");
        }
        System.out.println("[CLIENT] - Executing test completed...");
    }

    private static String addSample(java.lang.Double sample) {
        dummycex1aclient.TestWebService_Service service = new dummycex1aclient.TestWebService_Service();
        dummycex1aclient.TestWebService port = service.getTestWebServicePort();
        return port.addSample(sample);
    }

    private static Double findMinimumAmongSamples() {
        dummycex1aclient.TestWebService_Service service = new dummycex1aclient.TestWebService_Service();
        dummycex1aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumAmongSamples();
    }

    private static Double findMinimumBetween(java.lang.Double a, java.lang.Double b) {
        dummycex1aclient.TestWebService_Service service = new dummycex1aclient.TestWebService_Service();
        dummycex1aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetween(a, b);
    }

    private static Double findMinimumBetweenWithException(java.lang.Double a, java.lang.Double parameter1) throws Exception_Exception {
        dummycex1aclient.TestWebService_Service service = new dummycex1aclient.TestWebService_Service();
        dummycex1aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetweenWithException(a, parameter1);
    }

    private static Double findMinimumCoordinate(dummycex1aclient.Point2D point) {
        dummycex1aclient.TestWebService_Service service = new dummycex1aclient.TestWebService_Service();
        dummycex1aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumCoordinate(point);
    }

    private static String testConnection() {
        dummycex1aclient.TestWebService_Service service = new dummycex1aclient.TestWebService_Service();
        dummycex1aclient.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }
    
}
