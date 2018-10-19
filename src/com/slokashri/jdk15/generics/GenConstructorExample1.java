package com.slokashri.jdk15.generics;


public class GenConstructorExample1 {
    private double val;

    <T extends Number> GenConstructorExample1(T arg){
        val = arg.doubleValue();
    }

    void showValue(){
        System.out.println("Value: "+this.val);
    }

    public static void main(String[] args){

        GenConstructorExample1 genCon1 = new GenConstructorExample1(100);
        GenConstructorExample1 genCon2 = new GenConstructorExample1(500.5F);

        genCon1.showValue();
        genCon2.showValue();
    }
}
