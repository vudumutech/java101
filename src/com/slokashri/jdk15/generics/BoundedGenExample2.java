package com.slokashri.jdk15.generics;

public class BoundedGenExample2 {

    public static void main(String[] args){
        TwoWheelerDriver<TwoWheeler> twoWheelerDriver = new TwoWheelerDriver<>("Sajjad",LicenseTypes.TWO_WHEEL_LICENSE,new Bike());
        twoWheelerDriver.drive();

        TwoWheelerDriver<TwoWheeler> twoWheelerDriver1 = new TwoWheelerDriver<>("Khalid",LicenseTypes.TWO_WHEEL_LICENSE,new MotorBike());
        twoWheelerDriver1.drive();

        SuperDriver<TwoWheeler> vidya = new SuperDriver<>("Vidya",LicenseTypes.ANY_WHEEL,new Bike());
        vidya.drive();

        SuperDriver<FourWheeler> vijay = new SuperDriver<>("Vijay",LicenseTypes.ANY_WHEEL,new Car());
        vijay.drive();

        DrivingTestOfficer vandana = new DrivingTestOfficer("Vandana",LicenseTypes.TWO_WHEEL_LICENSE);
        vandana.validateSuperDriversWithTwoWheelers(vidya);
        System.out.println("Passed: "+ vandana.validateSuperDriversWithTwoWheelers(vidya));

        DrivingTestOfficer rahul = new DrivingTestOfficer("Rahul",LicenseTypes.LMV_LICENSE);
        System.out.println("Passed: "+ rahul.validateSuperDriversWithFourWheelers(vijay));

    }
}
