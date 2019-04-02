/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest2;

/**
 *
 * @author Luciferishie
 */
public class SimpleClient {
    
    SimpleCalculatorServer server = new SimpleCalculatorServer();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SimpleCalculationServerException {
        SimpleClient client = new SimpleClient();
        client.executeTest();
    }

    private void executeTest() throws SimpleCalculationServerException {
        if(server.isConnected()){
            System.out.println("[CLIENT] - The client is connected, the test can be proceed...");
            int num1=2;
            int num2=3;
            int sum = server.addIntegerNumbers(num1,num2);
            System.out.println("The sum of numbers are "+sum);
            
            int divide = server.divideIntegerNumbers(num1,num2);
        } else {
            System.out.println("[CLIENT] - The client is NOT connected, the test has failed..");
        }
        
        
    }
    
}
