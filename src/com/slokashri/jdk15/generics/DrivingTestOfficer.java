package com.slokashri.jdk15.generics;

public class DrivingTestOfficer {

    String name;
    LicenseTypes licenseType;

    public DrivingTestOfficer(String name, LicenseTypes licenseType) {
        this.name = name;
        this.licenseType = licenseType;
    }

    public boolean validateSuperDriversWithTwoWheelers (SuperDriver<? extends TwoWheeler> twoWheelerDriver){
        twoWheelerDriver.drive();
        return false;
    }

    public boolean validateSuperDriversWithFourWheelers (SuperDriver<? extends FourWheeler> fourWheelerDriver){
        fourWheelerDriver.drive();
        return true;
    }


}
