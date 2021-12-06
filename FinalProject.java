
package finalproject;

import java.util.Scanner;
public class FinalProject {

       final static double discount = .80; 
public static void main(String[] args) {
       int inputval;
       double total = 0.0;
       int cars;
       double fintotal = 0.0;
       double DiscountedPrice = 0.0;
       double RegularPrice =0.0;
       double PricePreDis = 0.0;
       int U=89;
       int H=75;
       int V=100;
       int O=45;
       int T=25;
       int S=16;
       double result1, result2,result3;
       String regserv,genmaitnace,statemaitnace,user,pass;
         
         
         Carservice myService =new Carservice(){};
         GenMaitnance myMaitnance =new GenMaitnance(){};
         StateReqMaitnance myState =new StateReqMaitnance(){};
         
         System.out.println("Welcome to Francisco's Auto Repair LLC!");
         
         System.out.println();
         String[] Cusnames = {"Al's HVAC", "Joe's Towing", "Rita's Busses", "Fred's Tour Guide", "Mikes Plumbing", "Dave's Trucking"};
         
         Scanner keyboard = new Scanner(System.in);
         int Cusnumber;
         try
         {
         System.out.println("Please Enter your Customer Account Number to Continue!");
         Cusnumber = Integer.parseInt(keyboard.nextLine());
         System.out.println("Welcome Back and Thank You for your business: " + Cusnames[Cusnumber]);
         }
         catch(ArrayIndexOutOfBoundsException error)
         {
         System.out.println("Customer Account Not Found.");
         System.exit(0);
         }
         
         System.out.println();
         
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter the number of viechles you want to service: (Must be more than 5 viechles!)");
         inputval = input.nextInt();
         
         if (inputval<5){
         System.out.println();
         System.out.println("Must service at least 5 or more viechles!");
         System.exit(0);
         } 
         else
         {
         for(int a=0;a<inputval; a++) {
         System.out.println();
         System.out.println("You're now working on viechle number: "+ (a+1));
         System.out.println();
         if(inputval>=8)
         {
         result1 = regservice(U,H);
         System.out.println();
         result2 = Matinance(V,O,T);
         System.out.println();
         result3 = Stateincpect(S);
         System.out.println();
         total = (result1 + result2 + result3);
         fintotal=total * discount;
         DiscountedPrice = DiscountedPrice + fintotal;
         PricePreDis = PricePreDis + total;
         System.out.println("Total for viechle number "+ (a+1) +" is: $"+total);
         System.out.println();     
         } 
               
         else
         {
         result1 = regservice(U,H);
         System.out.println();
         result2 = Matinance(V,O,T);
         System.out.println();
         result3 = Stateincpect(S);
         System.out.println();
         total = (result1 + result2 + result3);
         RegularPrice = RegularPrice + total;
         System.out.println("Total for viechle number "+ (a+1) +" is: $"+total);
         }
         
         
         }
         if(inputval<8){    
         System.out.println();
         System.out.println("Grand total for service is: $"+RegularPrice);
         System.out.println();
         System.out.println("Please give us a call to schedule a time for your service and Thank You for your Business!");
         }
         else{
         System.out.println("Grand total without discount is: $"+PricePreDis);
         System.out.println();
         System.out.println("New Grand Total for service with the 20% discount is: $"+DiscountedPrice);   
         System.out.println();
         System.out.println("Please give us a call to schedule a time for your service and Thank You for your Business!");
         }
         }
         }
public static int regservice(int U,int H)
{
 Carservice myService =new Carservice(){};
myService.raditorclean();
myService.headlightcleaning();
Scanner myscanner = new Scanner(System.in);
System.out.println();
System.out.println("Services offerd: Cleaning the raditor , Cleaning the headlights");
System.out.println("Select Car service: \n Raditor -> R\n Headlights -> H\n None -> N" );
String regserv = myscanner.nextLine();
if(regserv.equalsIgnoreCase("R"))
{
return  U;
}
else if(regserv.equalsIgnoreCase("H"))
{
return  H;
}
return 0;
}
   
public static int Matinance(int V ,int O, int T)
{
GenMaitnance myMaitnance =new GenMaitnance(){};  
myMaitnance.breaks();
myMaitnance.oilchange();
myMaitnance.topoff();
Scanner myscanner = new Scanner(System.in);
System.out.println();
System.out.println("Services offerd: Replacing all breaks, Oil & Oil Filter Change, All Other Liquids topoff");
System.out.println("Select Car service: \n Breaks -> B\n Oil Service -> O\n Topoff -> T\n None -> N" );
String genmaitnace = myscanner.nextLine();
if(genmaitnace.equalsIgnoreCase("B"))
{
return  V;
}
else if(genmaitnace.equalsIgnoreCase("O"))
{
return  O;
}
else if(genmaitnace.equalsIgnoreCase("T"))
{
return  T;
}
return 0;
}
  public static int Stateincpect(int S)
{
StateReqMaitnance myState =new StateReqMaitnance(){};
myState.stateincpect();
Scanner myscanner = new Scanner(System.in);
System.out.println();
System.out.println("Services offerd: State Incpection");
System.out.println("Select Car service: \n State Incpection -> I\n Not Needed -> N" );
String statemaitnace = myscanner.nextLine();
if(statemaitnace.equalsIgnoreCase("I"))
{
return  S;
}
return 0;
}
  
}
