/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveestimator;

/**
 *
 * @author PacoElJefe
 */
import java.util.Scanner;
public class MoveEstimator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numberofhours;
        int numberofmiles;
        int num1 = 200;
        int num2 = 150;
        int num3 = 2;
        
     
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Estimate Number Of Hours: ");
      
        numberofhours = myScanner.nextInt();
        
        System.out.println("Please Enter Number Of Miles: ");
       
        numberofmiles = myScanner.nextInt();
        
        int total = num1 + num2*numberofhours + num3*numberofmiles;
        System.out.println("Your Estimate Is " + total);
   
        
        
   
              
             
                
  
    
    
    }
    
}
