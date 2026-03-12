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
// OrganicBin type class  
public class OrganicBin extends Bin {

    // OrganicBin Constructor using super class
    public OrganicBin(String binID, String location, String zone, int fillLevel, int batteryLevel, String status) {
        super(binID, location, zone, "Organic", fillLevel, batteryLevel, status);
    }

    /**
     *
     * @return
     */
    // Polymorphism is used as each bin type has different rules
    @Override
    public String getCollectionPriority() {
        if (getFillLevel() >= 60) { // returns high if bin exceeds limit else normal
            return "High";
        }
        return "Normal";
    }
}
