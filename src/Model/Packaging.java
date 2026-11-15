/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author michh
 */
public class Packaging implements Chargeable {

    private int items = 3;
    private int chargePerItem = 25;

    public Packaging(int items, int chargePerItem) {
        this.items = items;
        this.chargePerItem = chargePerItem;
    }

    @Override
    public String label() {
        return "Empaque del pedido";
    }

    @Override
    public int calculateCharge() {
        return items * chargePerItem;
    }

}
