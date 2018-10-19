package com.slokashri.jdk15.generics;

public class LMVDriver <T extends FourWheeler & Vehicle> {

    String name;
    LicenseTypes licenseType;
    T fourWheler;
    public LMVDriver(String name, LicenseTypes licenseType, T fourWheler) {
        this.name = name;
        this.licenseType = licenseType;
        this.fourWheler = fourWheler;
    }


    public void drive(){
        this.fourWheler.drive();
    }

}
