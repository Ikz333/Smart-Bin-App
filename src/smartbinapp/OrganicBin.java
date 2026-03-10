/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbinapp;

/**
 *
 * @author ikram
 */
public class OrganicBin extends Bin {

    public OrganicBin(String binID, String location, String zone, int fillLevel, int batteryLevel, String status) {
        super(binID, location, zone, "Organic", fillLevel, batteryLevel, status);
    }

    public String getCollectionPriority() {
        if (getFillLevel() >= 60) {
            return "High";
        }
        return "Normal";
    }
}
