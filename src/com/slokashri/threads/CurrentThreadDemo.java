package com.slokashri.threads;

public class CurrentThreadDemo {
    public static void main(String args[]){
        Thread t = Thread.currentThread();

        System.out.println("Current Thread: "+t);

        System.out.println("Thread Name: "+t.getName());

        t.setName("CurrentDemoThread");

        System.out.println("After Name change: "+t);

        try{

            for (int i = 0; i<10; i++){
                System.out.println("i = "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){

        }
        finally {
            System.out.println("In Finally");      

        }
    }
}
