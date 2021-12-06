/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author PacoElJefe
 */
import java.util.Scanner;
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    double inputvalue=0;    
    Scanner myscanner = new Scanner(System.in);
    System.out.println(" Please enter how many temperatures you like: ");
    inputvalue = myscanner.nextDouble();
    
    double Result1 = 0;
    double Result2;
    
   for(int i=0;i<inputvalue;i++)   
{
    System.out.println("Please enter temperature: ");
   double y = myscanner.nextDouble();
 Result1 += y;   
 y++;
}
    Result2 = (Result1 / inputvalue);
    System.out.println("The average of your temperatures is: " + Result2);
    }
    
}
