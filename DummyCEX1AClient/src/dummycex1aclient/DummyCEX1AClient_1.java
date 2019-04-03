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
 * @author Gab
 */
public class DummyCEX1AClient_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DummyCEX1AClient_1 client = new DummyCEX1AClient_1();
        client.executeTest();
    }

    private void executeTest() {
        System.out.println("[CLIENT] - Executing Test, started...");

        /*
         Test Connection
         */
        if (testConnection().equals("OK")) {
            System.out.println("[CLIENT] - Server is connected, test continues....");

            /*
             findMinimumBetween
             */
            System.out.println("[CLIENT] - findMinimumBetween...");

            if (findMinimumBetween(3.0, 5.0) == 3.0) {
                System.out.println("[CLIENT] - findMinimumBetween, correct result");
            } else {
                System.out.println("[CLIENT] - findMinimumBetween, wrong result");
            }
            /*
             addSamples 
             */
            System.out.println("[CLIENT] - Adding Samples: 1.0, 3.4, 5.0, 7.12");
            addSample(1.0);
            addSample(3.4);
            addSample(5.0);
            addSample(7.12);
            /*
             finding minimum sample
             */
            System.out.println("[CLIENT] - Finding minimum among 1.0, 3.4, 5.0, 7.12");
            if (findMinimumAmongSamples() == 1.0) {
                System.out.println("[CLIENT] - findMinimumAmongSamples, correct result");
            } else {
                System.out.println("[CLIENT] - findMinimumAmongSamples, wrong result");
            }

            /*
             findMinimumBetweenWithException
             */
            try {
                if (findMinimumBetweenWithException(3.14, 2.17) == 2.17) {
                    System.out.println("[CLIENT] - findMinimumBetweenWithException, correct result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - findMinimumBetweenWithException, ERROR !!! YOU SHOULD NOT SEE THIS EXCEPTION");
            }

            /*
             findMinimumBetweenWithException
             */
            try {
                if (findMinimumBetweenWithException(3.14, null) == 2.17) {
                    System.out.println("[CLIENT] - findMinimumBetweenWithException, correct result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - findMinimumBetweenWithException, YOU SHOULD SEE THIS EXCEPTION");
            }

            /*
             findMinimumBetweenWithException
             */
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

                      /*
             findMinimumCoordinate
           
            
             */
            Point2D p   =   new Point2D();
            p.x = 5.4;
            p.y = 4.5;
            if(findMinimumCoordinate(p) == 4.5)
                    System.out.println("[CLIENT] - findMinimumCoordinate, correct result");
            else
                    System.out.println("[CLIENT] - findMinimumCoordinate, wrong result");
            
        } else {
            System.out.println("[CLIENT] - Server is NOT connected, test Failed !");

        }
        System.out.println("[CLIENT] - Executing Test, completed !");
    }

    private static String testConnection() {
        dummycex1aclient.TestWebService_Service service = new dummycex1aclient.TestWebService_Service();
        dummycex1aclient.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }

    private static Double findMinimumBetween(java.lang.Double a, java.lang.Double b) {
        dummycex1aclient.TestWebService_Service service = new dummycex1aclient.TestWebService_Service();
        dummycex1aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetween(a, b);
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

}
