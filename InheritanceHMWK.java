
package inheritance.hmwk;

import java.util.Scanner;
public class InheritanceHMWK {

   
    public static void main(String[] args) {
          int a,b; 
                Loans myLoans =new Loans(){};
                Car myCar = new Car();
                Mortgage myMortgage = new Mortgage();
             
          Scanner myscanner = new Scanner(System.in);
        System.out.println("please enter the amount of $ for the loan: " +"   (The loan has to equal or be more than 5000 doallars!)");
         a =myscanner.nextInt();
         System.out.println("please enter the length of the loan: " + "  (The loan has to also be longer than 10 years!)");
         b =myscanner.nextInt();
         
         if (a>5000 && b>10){
             System.out.println("Your Request is Accepted here are your options!");
         myLoans.bankloan();
         myCar.carloan();
         myCar.carloanpt2();
         myMortgage.mortage();
         myMortgage.mortageyep();
         
         }
        else
            System.out.println("The loan is invalid");
     
    }
    
     
    

}
