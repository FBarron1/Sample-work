
package arrayspt1;

import javax.swing.*;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ArraysPT1 {

   
    public static void main(String[] args) {  
   Scanner myScan = new Scanner(System.in);
   String[] colors = new String[10]; 
   String firstcolor;
    
    for(int x=0; x<colors.length; ++x)
    {
     System.out.println("Enter A color: ");
     firstcolor = myScan.nextLine();
     colors[x] = firstcolor;
     myScan.nextLine();
    }
       System.out.println(); 
       Arrays.sort(colors);
       
       System.out.println(Arrays.toString(colors));
       
      
    }
    
    
}
