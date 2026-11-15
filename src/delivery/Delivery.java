/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package delivery;

import Model.BikeDelivery;
import Model.Chargeable;
import Model.Packaging;
import Model.VanDelivery;

/**
 *
 * @author michh
 */
public class Delivery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Chargeable packaging = new Packaging(5, 15); 
                
        Chargeable bike = new BikeDelivery("B1", 2); 
        
        Chargeable van = new VanDelivery("V1", 19);
                
                
                
                
                
    }
    
}
