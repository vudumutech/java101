package com.slokashri.jdk18.lambda;

public class ConstructorRefExample1 {

    public static <R, I> R myClassFactory(MyConRefInterface<R, I> conRefInterface, I input){
        return conRefInterface.conFunction(input);
    }

    public static void main(String[] args) {
        MyConRefInterface<MyClass1<Integer>,Integer> myClass1Con = MyClass1<Integer>::new;
        MyConRefInterface<MyClass2,String> myClass2Con = MyClass2::new;
        MyConRefInterface<MyClass3[],Integer> myClass3ArrayCon = MyClass3[]::new;

        MyClass1<Integer> mc1 = myClassFactory(myClass1Con,100);

        System.out.println("Value in MyClass1 is: "+mc1.getVal());

        MyClass2 mc2 = myClassFactory(myClass2Con,"Hello String Constructor");

        System.out.println("Value in MyClass2 is: "+mc2.getValue());


        MyClass3[] mc3 = myClassFactory(myClass3ArrayCon,2);

        System.out.println("Array Length: "+mc3.length);
        mc3[0] = new MyClass3(2);
        mc3[1] = new MyClass3("Vidyasagar");
        System.out.println("Array Element class: "+mc3[0].getClass().getName());
        System.out.println("Array Element mc3[0]: "+mc3[0].getVal());
        System.out.println("Array Element mc3[1]: "+mc3[1].getVal());
    }

}

class MyClass1<T>{
    T t;

    public MyClass1(T t) {
        this.t = t;
    }

    public MyClass1(){
        t = null;
    }

    public T getVal(){
        return this.t;
    }
}

class MyClass2{
    String str;

    public MyClass2(String str) {
        this.str = str;
    }

    public MyClass2() {

        str = "";
    }

    String getValue(){
        return this.str;
    }
}

class MyClass3<T>{
    T t;

    public MyClass3(T t) {
        this.t = t;
    }

    public MyClass3(){
        t = null;
    }

    public T getVal(){
        return this.t;
    }
}

@FunctionalInterface
interface MyConRefInterface<ReturnType, InputType>{

    ReturnType conFunction(InputType inputType);
}
