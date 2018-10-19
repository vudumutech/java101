package com.slokashri.jdk15.generics;

public class BoundedGenExample1 <T extends Number> {

    T[] numbers;

    public BoundedGenExample1(T[] numbers){
        this.numbers = numbers;
    }

    public double computeAverage(){
        double sum = 0, avg = 0;

        for (T number: this.numbers) {
            sum+=number.doubleValue();
        }
        avg = sum/this.numbers.length;
        return avg;
    }

    public boolean sameAverage(BoundedGenExample1<?> obj){
        System.out.println("Average of invoking object: "+this.computeAverage());
        System.out.println("Average of parameter object: "+obj.computeAverage());
        return (this.computeAverage()==obj.computeAverage()? true:false);
    }

    public static void main(String[] args) {
        System.out.println("Bounded parameterized Generics example!");

        Double dNums[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        BoundedGenExample1<Double> dNumbers = new BoundedGenExample1<>(dNums);
        System.out.println("Average of doubles is: " + dNumbers.computeAverage());

        Integer iNums[] = {5, 6, 7, 8, 9, 10};
        BoundedGenExample1<Integer> iNumbers = new BoundedGenExample1<>(iNums);
        System.out.println("Average of integers is: " + iNumbers.computeAverage());

        if (dNumbers.sameAverage(iNumbers)) {
            System.out.println("Averages are the same!");
        } else {
            System.out.println("Averages are not the same!");
        }
    }
}
