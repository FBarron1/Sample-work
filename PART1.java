/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.pkg1;

/**
 *
 * @author PacoElJefe
 */

import java.util.Scanner;
public class PART1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double result,num=3 ,a=4;
     Scanner myScan = new Scanner(System.in);
     
     System.out.println("enter numbers to divde: ");
     num = myScan.nextInt();
     
     calcPercent(num , a);
     
     calcPercent(a , num);
  
     
    }
    public static void calcPercent(double num,double a)
    {
    System.out.println("The value of the first is" + num + "!");
    System.out.println("The value of the second is" + a + "!");
        double total = num/a;
    
        }
    
 
}
