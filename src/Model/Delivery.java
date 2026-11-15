/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author michh
 */
abstract class Delivery implements Chargeable{
    
    private String trackingId; 
    private int distanceKm; 

    public Delivery(String trackingId, int distanceKm) {
        this.trackingId = trackingId;
        this.distanceKm = distanceKm;
    }
    
    
    
    public int baseCharge(){
        return 40;
    }
    
    protected abstract int ratePerKm();
    
     @Override
    public String label() {
        return "Envío a domicilio";
    }

    @Override
    public int calculateCharge() {
        return baseCharge() + distanceKm * ratePerKm(); 
    }
    
}
