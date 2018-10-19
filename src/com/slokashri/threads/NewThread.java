package com.slokashri.threads;

public class NewThread implements Runnable {

    String name ;
    Thread t;

    public NewThread(String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println ("New thread "+name + " is created!");
        t.start();
    }
    public void run(){
        try{
            for (int i = 0; i<5 ; i++){
                System.out.println("Thread: "+name + " Iteration: "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ie){
                System.out.println("Thread: "+name+ " is interrupted!");
        }
        System.out.println("Thread: "+name + " is exiting...");
    }

}
