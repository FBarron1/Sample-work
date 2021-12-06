/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.pt2;

/**
 *
 * 
 */

import java.util.Scanner;
public class ArraysPt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner myScan = new Scanner(System.in);
        
        Employee[] emps = new Employee[4];
   int empnum;
    
    emps[0] = new Employee("John", "Manager", 60000);
    emps[1] = new Employee("Paul", "Train Driver", 76000);
    emps[2] = new Employee("Geroge", "Truck Driver", 68000);
    emps[3] = new Employee("Luke", "Engineer", 89000);
    
    
    System.out.println("Which Employee do you want to see info for 1-4?");
    empnum = myScan.nextInt();
    empnum = empnum-1;
    System.out.println("Heres the employees info "   );
    emps[empnum].showEmployeeData();
    
    
    
    
    }
    
}
