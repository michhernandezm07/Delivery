/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.BikeDelivery;
import Model.Chargeable;
import Model.Packaging;
import Model.VanDelivery;

public class ChargeableController {

    BikeDelivery[] bikesDelivery = new BikeDelivery[10];
    VanDelivery[] vansDelivery = new VanDelivery[10];
    Packaging[] packagings = new Packaging[10];

    public void registrarBikeDelivery(String trackingId, double distanceKm) {
        BikeDelivery newBike = new BikeDelivery(trackingId, (int) distanceKm);
        for (int i = 0; i < bikesDelivery.length; i++) {
            if (bikesDelivery[i] == null) {
                bikesDelivery[i] = newBike;
            }

        }

    }

    public void registrarVanDelivery(String trackingId, double distanceKm) {
        VanDelivery newVans = new VanDelivery(trackingId, (int) distanceKm);
        for (int i = 0; i < vansDelivery.length; i++) {
            if (vansDelivery[i] == null) {
                vansDelivery[i] = newVans;
            }
        }

    }

    public void registrarPackaging(int items, double chargePerItem) {
        Packaging newPackaging = new Packaging(items, (int) chargePerItem);
        for (int i = 0; i < packagings.length; i++) {
            if (packagings[i] == null) {
                packagings[i] = newPackaging;

            }
        }

    }

    public double calcularTotalGeneral() {
        double bikeTotal = 0;
        double vanTotal = 0;
        double packagingTotal = 0;
        double total = 0;
        for (int i = 0; i < bikesDelivery.length; i++) {
            bikeTotal += bikesDelivery[i].calculateCharge();
            vanTotal += vansDelivery[i].calculateCharge();
            packagingTotal += packagings[i].calculateCharge();

        }

        for (int i = 0; i < vansDelivery.length; i++) {
            vanTotal += vansDelivery[i].calculateCharge();
        }

        for (int i = 0; i < packagings.length; i++) {
            packagingTotal += packagings[i].calculateCharge();

        }

        total = bikeTotal + vanTotal + packagingTotal;

        return total;
    }
}
