/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author michh
 */
public class BikeDelivery extends Delivery{

    public BikeDelivery(String trackingId, int distanceKm) {
        super(trackingId, distanceKm);
    }

    @Override
    protected int ratePerKm() {
       return 8; 
    }
    
}
