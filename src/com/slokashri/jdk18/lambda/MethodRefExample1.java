package com.slokashri.jdk18.lambda;

public class MethodRefExample1 {

    public static void main(String[] args) {

        //Reverse the string
        System.out.println(doSpecificedStringOperation(MethodRefExample1::stringReverse,"This is an example of passing static method reference"));
        System.out.println("");

        System.out.println(doSpecificedStringOperation(MethodRefExample1::stringToUpperCase,"all lower case converted to upper case"));
        System.out.println("");

        System.out.println(doSpecificedStringOperation(new MethodRefExample1()::stringToLowerCase,"This is an example of passing instance method reference"));


    }

    public static String doSpecificedStringOperation(StringOperation strOp, String inputStr){
        return strOp.someOperation(inputStr);
    }


    public static String stringReverse(String str){

        String reversed = "";
        for (int i=str.length()-1;i>=0; i--){

            reversed+=str.charAt(i);

        }

            return reversed;
    }

    public static String stringToUpperCase(String str){

        return str.toUpperCase();
    }

    public String stringToLowerCase(String str){

        return str.toLowerCase();
    }

    @FunctionalInterface
    interface StringOperation{
        String someOperation(String str);
    }
}
