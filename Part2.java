/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.pkg2;

/**
 *
 * @author PacoElJefe
 */

import java.util.Scanner;
import java.util.HashSet;
public class Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fMeat, sMeat;
        double sandwhichprice; 
        Scanner myScanner = new Scanner(System.in);
        SandwichClass2 meat1 = new SandwichClass2();
        SandwichClass2 meat2 = new SandwichClass2();
        
        System.out.println("Please Enter meat for first sandwhich: ");
        fMeat = myScanner.nextLine();
        meat1.setSand_which1(fMeat);
        System.out.println("Please Enter meat for second sandwhich: ");
        fMeat = myScanner.nextLine();
        meat2.setSand_which1(fMeat);
        System.out.println("Please Enter price of sandwhich: ");
        double sandNum = myScanner.nextDouble();
        meat2.setSandNum(sandNum);
        
       meat1.sandNum = 4;
       meat2.sandNum = 4;
       
        
        System.out.println(meat1.getfirstmeat() + meat1.getsandNum());
        System.out.println(meat2.getfirstmeat() + meat2.getsandNum());
        
        
        
   
        
    }
    
}
