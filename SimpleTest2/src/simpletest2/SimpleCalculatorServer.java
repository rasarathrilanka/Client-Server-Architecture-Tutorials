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
public class SimpleCalculatorServer {
    
    public int addIntegerNumbers(int num1, int num2){
        return num1+num2;
    }
    
    public int divideIntegerNumbers(int num1, int num2)throws SimpleCalculationServerException{
        if(num2==0){
            throw new SimpleCalculationServerException("Cannot divide number to zero");
        }
        if((num1==0)&&(num2==0)){
            throw new SimpleCalculationServerException("Cannot divide number to zero");
        }
        return num1/num2;
    }

    public boolean isConnected() {
        System.out.println("[SERVER] - Connection is being Tested..");
        return true;
    }

}
