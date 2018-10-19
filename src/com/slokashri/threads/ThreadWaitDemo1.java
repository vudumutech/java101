package com.slokashri.threads;

public class ThreadWaitDemo1 {

    public static void main (String args[]){
        NewThread t1 = new NewThread("T1");
        NewThread t2 = new NewThread("T2");
        NewThread t3 = new NewThread("T3");

        System.out.println("Thread t1.isAlive() is: "+t1.t.isAlive());
        System.out.println("Thread t2.isAlive() is: "+t2.t.isAlive());
        System.out.println("Thread t3.isAlive() is: "+t3.t.isAlive());

        try{
            System.out.println("Waiting for the threads to finish");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException ie){
            System.out.print("Thread: "+ Thread.currentThread()+ " interruped!");
        }


        System.out.println("Thread t1.isAlive() is: "+t1.t.isAlive());
        System.out.println("Thread t2.isAlive() is: "+t2.t.isAlive());
        System.out.println("Thread t3.isAlive() is: "+t3.t.isAlive());

        System.out.println ("Main thread exiting....");
    }
}
