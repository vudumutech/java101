package com.slokashri.exceptions;

public class SuperSubCatch {
    public static void main(String args[]){
        try{
            int a = 0;
            int b = 42/a;

        } catch (Exception e){
            System.out.println("Generic Exception Catch!");

        } //catch (ArithmeticException ae){
            //System.out.println("This is never reached and hence the compile error!");
        //}
        finally {

        }
    }
}
