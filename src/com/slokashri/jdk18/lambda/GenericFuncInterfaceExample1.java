package com.slokashri.jdk18.lambda;

public class GenericFuncInterfaceExample1 {

    public static void main(String[] args) {
        GenFuncInterface<Integer> factorial = (num)->{
            int result = 1;
            for (int i = 1; i<=num; i++) {
                result = result*i;
            }
            return result;
        };
        System.out.println("Factorial of 10 is: "+factorial.someFunc(10));
        System.out.println("");

        GenFuncInterface<String> stringReverse = (inputString)->{

            String result = "";

            for (int i=inputString.length()-1; i>=0; i-- ){
                result+=inputString.charAt(i);
            }

            return result;
        };

        System.out.println("Reverse of 'Lambda Expressions are nice!' is: "+stringReverse.someFunc("Lambda Expressions are nice!"));
        System.out.println("");

        GenFuncInterface<String> strSpaceRemove = (inputStr)->{
            String strWithNoSpace = "";

            for (int i = 0; i<inputStr.length(); i++){
                if(inputStr.charAt(i)!=' '){
                    strWithNoSpace+=inputStr.charAt(i);
                }
            }
          return strWithNoSpace;
        };

        System.out.println("Input String: 'This string is without spaces'");
        System.out.println(myStringOperation(strSpaceRemove,"This string is without spaces"));
        System.out.println("");

        System.out.println("Reverse of 'Lambda Expressions are nice!' with method argument is: ");
        System.out.println(myStringOperation(stringReverse,"Lambda Expressions are nice!"));

    }

    public static String myStringOperation(GenFuncInterface<String> funcInterface, String inputStr){

        String returned = funcInterface.someFunc(inputStr);

        return "Hello..."+returned;
    }
}

@FunctionalInterface
interface GenFuncInterface<T>{
    T someFunc(T t);
}
