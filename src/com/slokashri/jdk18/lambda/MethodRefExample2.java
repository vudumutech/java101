package com.slokashri.jdk18.lambda;

public class MethodRefExample2 {

    public static void main(String[] args) {

        HighTemp[] weekDayHighs = {new HighTemp(91), new HighTemp(85),
                new HighTemp(81), new HighTemp(75), new HighTemp(95),
            new HighTemp(91),new HighTemp(82)};

        int count;

        count = counter(weekDayHighs,HighTemp::sameTemp,new HighTemp(91));

        System.out.println(count+" days had same high of 91 ");
        System.out.println("");

        count = counter(weekDayHighs,HighTemp::lessThanTemp,new HighTemp(90));
        System.out.println(count+" days had high of less than 90 ");
    }

    static <T> int counter(T[] vals, MyFunction<T> function, T v){

        int count = 0;
            for (int i = 0; i<vals.length;i++){
                if(function.func(vals[i],v)){
                    count++;
                }
            }

        return count;
    }


}

class HighTemp{

    int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    public boolean sameTemp(HighTemp ht){
        return (this.hTemp==ht.hTemp);
    }

    public boolean lessThanTemp(HighTemp ht){
        return (this.hTemp < ht.hTemp);
    }
};

@FunctionalInterface
interface MyFunction<T>{
    boolean func(T v1, T V2);
};


