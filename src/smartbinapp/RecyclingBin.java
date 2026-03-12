/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbinapp;

/**
 *
 * @author ikram
 */
// Inheritance used 
// RecyclingBin type class 
public class RecyclingBin extends Bin {

    // RecyclingBin Constructor using super class
    public RecyclingBin(String binID, String location, String zone, int fillLevel, int batteryLevel, String status) {
        super(binID, location, zone, "Recycling", fillLevel, batteryLevel, status);
    }

    /**
     *
     * @return
     */
    // Polymorphism is used as each bin type has different rules
    @Override
    public String getCollectionPriority() { // returns high if bin exceeds limit else normal
        if (getFillLevel() >= 70) {
            return "High";
        }
        return "Normal";
    }
}
