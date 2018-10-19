package com.slokashri.jdk18.lambda;

public class LambdaExpression2 {


    public static void main(String[] args) {

        MyCondition isEven = (num -> num%2==0);
        System.out.println("10 is even? : "+isEven.test(10));

        MyCondition isPositive = (num -> num >=0);
        System.out.println("10 is positive? :"+isPositive.test(10));
    }
}

interface MyCondition {
    boolean test(int num);
}