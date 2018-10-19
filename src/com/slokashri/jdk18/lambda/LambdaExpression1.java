package com.slokashri.jdk18.lambda;

public class LambdaExpression1 {

    public static void main(String[] args) {
        MyNumber num1,num2;
        num1 = ()->123;
        num2 = ()->321;
        System.out.println("My first simple lambda expression: "+ num1.getMyNum());
        System.out.println("My first simple lambda expression: "+ num2.getMyNum());

        MyRandomNumber randomNumber1 = ()->Math.random()*100;
        MyRandomNumber randomNumber2 = ()->Math.random()*1000;
        System.out.println("Random number 1: "+randomNumber1.getMyRadomNumber());
        System.out.println("Random number 2: "+randomNumber2.getMyRadomNumber());
    }
}

interface MyNumber {
    double getMyNum();
}

interface MyRandomNumber {
    double getMyRadomNumber();
}