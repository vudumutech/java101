package com.slokashri.jdk15.generics;

public class HMVDriver <T extends SixPlusWheeler & Vehicle>  {
    String name;
    LicenseTypes licenseType;
    T sixPlusVehicle;

    public HMVDriver(String name, LicenseTypes licenseType, T sixPlusVehicle) {
        this.name = name;
        this.licenseType = licenseType;
        this.sixPlusVehicle = sixPlusVehicle;
    }

    public void drive(){
        this.sixPlusVehicle.drive();
    }
}
