
package string.assingment;


import java.util.Scanner; 
import javax.swing.*;
public class StringAssingment {

   
    public static void main(String[] args) {
        String mysongQuote="wait till i get my money right", usersongQuote= "";
        int x,y,a,g;
        
        usersongQuote = JOptionPane.showInputDialog("Please enter favorite song quote: ");      
        x=0;
        y=0;
        a=0;
        g=0;
        String b;
        String w;
        while(x<mysongQuote.length()){
            if(mysongQuote.charAt(x) == ' ')
            {
              y++;
            }
            x++; 
        }
        System.out.println("The amount of spaces in my quote are: " + y);
       while(a<usersongQuote.length()){
            if(usersongQuote.charAt(a) == ' ')
            {
              g++;
            }
            a++;
           
            
        }
        System.out.println("The amount of spaces in your quote: " +g);
    
    
    StringBuilder whatever = new StringBuilder ("Hello my name is Francisco, "); 
    System.out.println ("Hello my name is Francisco, ");
    
    Scanner myscanner = new Scanner(System.in);
    System.out.println("Enter something you want to add to the last statement: ");
    b = myscanner.nextLine();
    StringBuilder userwhatever = new StringBuilder(b);
    
     userwhatever = whatever.append(b);
     System.out.println( userwhatever);
    
     
    
    System.out.println("Please enter your phone number with the area code or other symbols ");
    w = myscanner.nextLine();
    System.out.println(w);
    
    StringBuilder phonenumber = new StringBuilder(w);
    phonenumber.insert(0,"(");
    phonenumber.insert(4,")");
    phonenumber.insert(8,"-");
    
   System.out.println(phonenumber);   
    }
}
