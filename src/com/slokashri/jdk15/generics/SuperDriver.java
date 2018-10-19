package com.slokashri.jdk15.generics;

public class SuperDriver <T extends AnyWheeler> {
    String name;
    LicenseTypes licenseType;
    T anyVehicle;

    public SuperDriver(String name, LicenseTypes licenseType, T anyVehicle) {
        this.name = name;
        this.licenseType = licenseType;
        this.anyVehicle = anyVehicle;
    }

    public void drive(){
        System.out.println(this.name + " is a super driver with license type: "+this.licenseType);
        this.anyVehicle.drive();
    }
}
