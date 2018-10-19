package com.slokashri.lang;

public class Primwrappers {

    public static void main(String[] args) {
        System.out.println("Float.Nan: "+Float.NaN);
        System.out.println("Float.MAX_VALUE: "+Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE: "+Float.MIN_VALUE);
        System.out.println("Float.MIN_NORMAL: "+Float.MIN_NORMAL);
        System.out.println("Float.POSITIVE_INFINITY: "+Float.POSITIVE_INFINITY);
        System.out.println("Float.NEGATIVE_INFINITY: "+Float.NEGATIVE_INFINITY);
        System.out.println("--------------------");
        System.out.println("Byte.BYTES: "+Byte.BYTES);
        System.out.println("Integer.BYTES: "+Integer.BYTES);
        System.out.println("Long.BYTES: "+Long.BYTES);
        System.out.println("Double.BYTES: "+Double.BYTES);
        System.out.println("Float.BYTES: "+Float.BYTES);
        System.out.println("-----------------------");

        System.out.println("Byte.SIZE: "+Byte.SIZE);
        System.out.println("Integer.SIZE: "+Integer.SIZE);
        System.out.println("Long.SIZE: "+Long.SIZE);
        System.out.println("Double.SIZE: "+Double.SIZE);
        System.out.println("Float.SIZE: "+Float.SIZE);

        System.out.println("-----------------------");

        System.out.println("Byte.TYPE: "+Byte.TYPE);
        System.out.println("Integer.TYPE: "+Integer.TYPE);
        System.out.println("Long.TYPE: "+Long.TYPE);
        System.out.println("Double.TYPE: "+Double.TYPE);
        System.out.println("Float.TYPE: "+Float.TYPE);

        System.out.println("-----------------------");
        Primwrappers.isNaNTest();
    }

    public static void isNaNTest(){

        Double d1 = new Double(1.0/-0.0);
        Double d2 = new Double (0/0.);

        System.out.println("d1: "+d1+"--> isNaN: "+d1.isNaN() + "; isInfinite: "+d1.isInfinite());
        System.out.println("d2: "+d2+"--> isNaN: "+d2.isNaN() + "; isInfinite: "+d2.isInfinite());
    }
}
