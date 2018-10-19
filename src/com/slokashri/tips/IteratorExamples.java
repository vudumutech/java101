package com.slokashri.tips;

import java.util.Arrays;
import java.util.function.Consumer;

public class IteratorExamples {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(" Plain Iteration 1");
        //plain iteration 1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" num: " + numbers[i]);
        }

        System.out.println("");
        System.out.println(" Plain Iteration 2");
        //plain iteration 2
        for (Integer num : numbers) {
            System.out.print(" num: " + num);
        }

        System.out.println("");
        System.out.println(" Iteration through streams");
        Arrays.stream(numbers).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(" num: " + integer);
            }
        });

        System.out.println("");
        System.out.println(" Iteration through streams and lambda");
        Arrays.stream(numbers).forEach((num) -> {
                    System.out.print(" num: " + num);
                }
        );


        System.out.println("");
        System.out.println(" Iteration through streams and lamda method reference");
        Arrays.stream(numbers).forEach(System.out::print);

        System.out.println("");
        System.out.println(" Iteration through streams and lamda method reference 2");

        Arrays.stream(numbers).forEach(IteratorExamples::printNum);
    }

    public static void printNum(Integer num){
        System.out.print(" num: "+num);
    }

}
