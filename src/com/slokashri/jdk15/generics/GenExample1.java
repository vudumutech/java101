package com.slokashri.jdk15.generics;

public class GenExample1 <T> {
    T ob;

    public GenExample1(T ob) {
        this.ob = ob;
    }

    /*public GenExample1() {
    }*/

    public T getObj(){
        return this.ob;
    }

    public void showType(){
        System.out.println("The object class is: (simple name) "+this.ob.getClass().getSimpleName());
        System.out.println("The object class is: (name) "+this.ob.getClass().getName());
        System.out.println("The object class is: (canonical name) "+this.ob.getClass().getCanonicalName());
        System.out.println("The object class is: (type name) "+this.ob.getClass().getTypeName());
    }


    public static void main(String[] args){

        //autoboxing in action
        GenExample1<Integer> iOb = new GenExample1<>(55);
        iOb.showType();

        int i = iOb.getObj();
        System.out.println("value of i: "+ i);

        GenExample1<Double> dOb = new GenExample1<>(new Double(22.0));
        dOb.showType();

        Double dObject = dOb.getObj(); // type safety in action. no casting required
        System.out.println("Value of dObject: "+dObject);

        double dPrimitive = dOb.getObj(); // autoboxing and type safety in action

        GenExample1<String> strGenTest = new GenExample1<>("String Generics Test");
        strGenTest.showType();

        System.out.println("Value in strGenTest: "+strGenTest.getObj());
    }


}
