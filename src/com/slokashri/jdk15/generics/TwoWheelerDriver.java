package com.slokashri.jdk15.generics;

public class TwoWheelerDriver <T extends TwoWheeler & Vehicle> {
    String name;
    LicenseTypes licenseType;
    T twoWheeler;

    public TwoWheelerDriver(String name, LicenseTypes licenseType, T twoWheeler) {
        this.name = name;
        this.licenseType = licenseType;
        this.twoWheeler = twoWheeler;
    }

    public void drive (){
        System.out.println(this.name+" is the driver with license type "+licenseType);
        this.twoWheeler.drive();
    }
}
