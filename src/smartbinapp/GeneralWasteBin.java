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
// GeneralWasteBin type class 
public class GeneralWasteBin extends Bin {

    // GeneralWasteBin Constructor using super class
    public GeneralWasteBin(String binID, String location, String zone, int fillLevel, int batteryLevel, String status) {
        super(binID, location, zone, "General Waste", fillLevel, batteryLevel, status);
    }

    /**
     *
     * @return
     */
    // Polymorphism is used as each bin type has different rules
    @Override
    public String getCollectionPriority() {
        if (getFillLevel() >= 80) { // returns high if bin exceeds limit else normal
            return "High";
        }
        return "Normal";
    }
}
