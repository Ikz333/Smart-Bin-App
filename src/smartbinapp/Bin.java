package smartbinapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikram
 */
public class Bin {
    String BinID;
    String Location;
    String Zone;
    String BinType;
    int FillLevel;
    int BatteryLevel;
    String Status;

    public Bin(String BinID, String Location, String Zone, String BinType, int FillLevel, int BatteryLevel, String Status) {
        this.BinID = BinID;
        this.Location = Location;
        this.Zone = Zone;
        this.BinType = BinType;
        this.FillLevel = FillLevel;
        this.BatteryLevel = BatteryLevel;
        this.Status = Status;
    }

    public String getBinID() {
        return BinID;
    }

    public void setBinID(String BinID) {
        this.BinID = BinID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public String getBinType() {
        return BinType;
    }

    public void setBinType(String BinType) {
        this.BinType = BinType;
    }

    public int getFillLevel() {
        return FillLevel;
    }

    public void setFillLevel(int FillLevel) {
        this.FillLevel = FillLevel;
    }

    public int getBatteryLevel() {
        return BatteryLevel;
    }

    public void setBatteryLevel(int BatteryLevel) {
        this.BatteryLevel = BatteryLevel;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Bin{" + "BinID=" + BinID + ", Location=" + Location + ", Zone=" + Zone + ", BinType=" + BinType + ", FillLevel=" + FillLevel + ", BatteryLevel=" + BatteryLevel + ", Status=" + Status + '}';
    }
    
    
    
}
