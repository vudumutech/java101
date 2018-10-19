package com.slokashri.jdk18.lambda;

public class MethodRefWithGenericsExample1 {

    public static void main(String[] args) {

        Integer[] intArray = {1,2,2,3,4,4,6,5,4,7};
        String [] strArray = {"Rahul", "Vidya", "Rahul", "Vandana", "Kirti", "Sajjad", "Kirti"};

        int count;

        count=myOps(MethodRefWithGenericsExample1::<Integer> countMatching,intArray,4);

        System.out.println("4 appeared "+count+" times in the int array!");

        count=myOps(MethodRefWithGenericsExample1::<String> countMatching, strArray,"Vijay");
        System.out.println("Vijay appeared "+count+" times in the String array!");
    }

    public static <T> int myOps(ArrayOps<T> myOperation, T[] valuesArray, T value){
        return myOperation.arrayOperation(valuesArray,value);
    }

    public static <T> int countMatching(T[] valuesArray, T value){
        int count = 0;
        for (int i=0; i<valuesArray.length; i++){
            if(valuesArray[i]==value){
                count++;
            }
        }

        return count;
    }
}

@FunctionalInterface
interface ArrayOps<T>{
    int arrayOperation(T[] vals, T v);
}
