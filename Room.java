package project.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PacoElJefe
 */
public class Room {
   String type;
    boolean oceanview=false;
    int pets=0;
    double price=0;
    double total=0;
   
    void setdata(String t,boolean ov,int p){ 
        type=t;
        oceanview=ov;
        pets=p;
    }
    
    void setprice(){ 
        if( type.equals("K") || type.equals("k")) 
         price=150;
        else if (type.equals("S") || type.equals("s")) 
         price=275;
        else if (type.equals("Q") || type.equals("q")) 
          price=150;
        else if(type.equals("T") || type.equals("t")) 
           price=125;
        else
          System.out.println("Wrong type");
    }
    
    
   
    void cal_total(){ 
        if(pets!=0) 
          price=price+(pets*50);
        if(oceanview) 
          price=price+45;
        if(oceanview && (pets!=0))
          price=price+45+ (pets*50);
        
        total=total+price;
    }
    
    double gettotal(){ 
        return total;
    }
}