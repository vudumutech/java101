package com.slokashri.jdk18.lambda;

public class BlockLambdaExample1 {
    public static void main(String[] args) {
        MyNumbericFunc factorial = (num) ->{

            int result = 1;
            for (int i = 1; i<=num; i++) {
                result = result*i;
            }
          return result;
        };

        System.out.println("Factorial of 5 is: "+factorial.func(5));
    }

    interface MyNumbericFunc {
        int func(int num);
    }
}
