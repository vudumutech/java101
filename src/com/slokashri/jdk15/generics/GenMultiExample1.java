package com.slokashri.jdk15.generics;

public class GenMultiExample1<T1, T2> {

    T1 obj1;
    T2 obj2;
    public GenMultiExample1(T1 obj1, T2 obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void showTypes(){
        System.out.println("Type of Obj1: "+this.obj1.getClass().getName());
        System.out.println("Type of Obj2: "+this.obj2.getClass().getName());
    }

    public T1 getObj1(){
        return this.obj1;
    }
    public T2 getObj2(){
        return this.obj2;
    }

    public static void main(String[] args){
        System.out.println("Multiple Parameterized type Generics example!");

        GenMultiExample1<Integer, String> example1 = new GenMultiExample1<>(99,"MultiGeneric1 Test");
        example1.showTypes();


    }
}
