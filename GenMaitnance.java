/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author PacoElJefe
 */
public class GenMaitnance extends Carservice {
 
     public void oilchange() {
        
        System.out.println("Oil & Oil Filter Change cost: $45");
    }

 public void breaks() {
        
        System.out.println("Break Change cost: $100 ");
    }

 public void topoff() {
        
        System.out.println("All Other Liquids topoff cost: $25");
    }
}
