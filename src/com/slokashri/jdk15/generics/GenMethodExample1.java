package com.slokashri.jdk15.generics;

public class GenMethodExample1 {

    static <T extends Comparable<T>, V extends T> boolean isAMember(T t, V[] varray){
        for(int i=0; i<varray.length; i++){
            if(t.equals(varray[i])) return true;
        }
        return false;
    }

    public static void main(String[] args){
        Integer numbers[] = {1,2,3,4,5,6,7,8,9};
        if(isAMember(2,numbers)){
            System.out.println("2 is in numbers");
        }

        if(!isAMember(12,numbers)){
            System.out.println("12 is NOT in numbers");
        }

        String names[] = {"Vidya", "Khalid", "Vandana", "Rahul", "Vijay"};

        if(!isAMember("Sajjad",names)){
            System.out.println("Sajjad is NOT in names");
        }

        if(isAMember("Khalid",names)){
            System.out.println("Khalid is in names");
        }

    }
}
