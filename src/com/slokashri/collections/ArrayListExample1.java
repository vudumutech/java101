package com.slokashri.collections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public class ArrayListExample1 {

    public static void main(String[] args) {
        //ArrayListExample1.addition();

        //ArrayListExample1.printAllFields();

        ArrayListExample1.convertToArray();
    }

    public static void convertToArray(){
        ArrayList<Integer> intArrList = new ArrayList<>();

        intArrList.add(5);
        intArrList.add(6);
        intArrList.add(7);
        intArrList.add(8);
        intArrList.add(9);


        System.out.println("intArrList: "+intArrList);

        Integer[] destArray = new Integer[intArrList.size()];
        destArray = intArrList.toArray(destArray);

        int sum = 0;
        for (Integer i: destArray
             ) {
            System.out.println(i);
            sum+=i;
        }

        System.out.println("destArray SUM: "+sum);
    }

    public static void addition(){
        ArrayList<String> stringArray = new ArrayList();

        System.out.println("stringArray initial size: "+stringArray.size());

        stringArray.add("Z");
        stringArray.add("A");
        stringArray.stream().forEach(System.out::println);
        stringArray.add(1,"Y");
        stringArray.add(3,"B");
        stringArray.add("a");
        stringArray.stream().forEach(System.out::println);
        System.out.println("Removing elements matching 'a'");
        stringArray.removeIf(s -> s.equalsIgnoreCase("a"));
        stringArray.stream().forEach(System.out::println);
        ArrayList<String> tempArray = new ArrayList<>();
        tempArray.add("Z");
        stringArray.removeAll(tempArray);
        System.out.println("Removing elements matching 'Z'");
        stringArray.stream().forEach(System.out::println);
        System.out.println("Current Size: "+stringArray.size());
        System.out.println("Ensuring capacity to be 10");
        stringArray.ensureCapacity(10);
        stringArray.add("Sagar");

        System.out.println("Current size: "+stringArray.size());
        stringArray.stream().forEach(System.out::println);
        System.out.println("trimming to size....");
        stringArray.trimToSize();
        System.out.println("Current size: "+stringArray.size());

    }

    public static void printAllFields(){
        Field[] fields1 = ArrayList.class.getDeclaredFields();
        Field[] fields2 = ArrayList.class.getFields();
        System.out.println("Declared Fields------");
        Arrays.stream(fields1)//.filter(field -> Modifier.isPublic(field.getModifiers()))
                                .forEach(field -> System.out.println(field.getName()));

        System.out.println("Fields------");
        Arrays.stream(fields2)//.filter(field -> Modifier.isPublic(field.getModifiers()))
                .forEach(field -> System.out.println(field.getName()));
//        try {
//            Field field = ArrayList.class.getDeclaredField("elementData");
//            System.out.println("Modifier: " +field.getModifiers());
//            System.out.println("Is Final: "+Modifier.isFinal(field.getModifiers()));
//            System.out.println("Is Public: "+Modifier.isPublic(field.getModifiers()));
//            System.out.println("Is Private: "+Modifier.isPrivate(field.getModifiers()));
//            System.out.println("Is Protected: "+Modifier.isProtected(field.getModifiers()));
//
//        } catch (Exception e){
//            System.out.println("Exception: "+ e.getMessage());
//        }
    }
}
