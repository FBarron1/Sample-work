
package project.pkg1;

import java.util.Scanner;
public class PROJECT1 {

 public static void main(String[] args)
    {
        
int o, r;
int t = 5;
int u = 275;
int k = 150;
int q = 150;
int d = 125;
int v = 45;
int c = 50;         
double result1 = 0;
int result2;
double result3;
double roomTotal;
double ThreeroomTotal = 0.0;
double TaxThreeroom = 0.0;

for(int i=0;i<3;i++)   
{
result1 = room(u, k, q,  d);
result2 = oceanview(v);
result3 = pets(c);
roomTotal = (result1+result2+result3);
System.out.println("Total for Room "+ (i+1) +" : "+roomTotal);
ThreeroomTotal = ThreeroomTotal + roomTotal;
}


System.out.println("Sub Total for all 3 Rooms : "+ThreeroomTotal);
TaxThreeroom = ThreeroomTotal*0.05;
System.out.println("Tax for all 3 Rooms : "+TaxThreeroom);
System.out.println("Grand Total for all 3 Rooms : "+(ThreeroomTotal+TaxThreeroom)); 
}

public static double pets(int c)
{
int p = 0;
double additionalCharge = 0.0;
Scanner myscanner = new Scanner(System.in);
System.out.println("Do you have Pets?(Yes or No)");
String answer = myscanner.nextLine();
if(answer.equalsIgnoreCase("Yes"))
{
System.out.println("How many pets are you brining? Each pet is an additional $50 charge: ");
p = myscanner.nextInt();
if(p==0)
System.out.println("No Pets so no additional charge!");	
else{
additionalCharge = p * c; 
}
}
else{
System.out.println("No Pets so no additional charge!");
}

return additionalCharge;
}


public static int room(int u,int k,int q,int d)
{
Scanner myscanner = new Scanner(System.in);
System.out.println("Room Prices: Suite is $275, King is $150, Queen is $150, Two doubles is $125");
System.out.println("Select Room Type: \n Suite-> S\n King-> K\n Queen-> Q\n Two doubles-> T" );
String roomType = myscanner.nextLine();
if(roomType.equalsIgnoreCase("S"))
{
return  u;
}
else if(roomType.equalsIgnoreCase("K"))
{
return  k;
}
else if(roomType.equalsIgnoreCase("Q"))
{
return q;
}
else if(roomType.equalsIgnoreCase("T"))
{
return d;
}
return 0;
} 


public static int oceanview(int v)
{
Scanner myScanner = new Scanner(System.in);
System.out.println("Would you like a Oceanview room (Yes or No): ");
String oceanview = myScanner.nextLine();
if(oceanview.equalsIgnoreCase("Yes"))
return v;
else 
return 0;

}

}