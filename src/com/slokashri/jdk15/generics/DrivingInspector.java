package com.slokashri.jdk15.generics;

public class DrivingInspector <V extends AnyWheeler, Sd extends SuperDriver> implements Inspector<V> {
    private V vechile;
    private Sd superDriver;

    public DrivingInspector(V vechile, Sd superDriver) {
        this.vechile = vechile;
        this.superDriver = superDriver;
    }

    public boolean inspect(V vehicle){
        if (superDriver.licenseType == LicenseTypes.ANY_WHEEL) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        Car car = new Car();
        DrivingInspector<Car,SuperDriver> drivingInspector = new DrivingInspector<>(car,new SuperDriver("Sajjad",LicenseTypes.TWO_WHEEL_LICENSE,car));

        if (drivingInspector.inspect(car)){
            System.out.println("Result: PASSED!");
        } {
            System.out.println("Result: FAILED :-( ");
        }


    }
}
