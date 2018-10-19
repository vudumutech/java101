package com.slokashri.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDemo {
    public static void main(String[] args) {

        try {
            ParseDemo.parseDemoMethod();
        } catch (IOException ioe){
            System.out.println("IO Exception occurred....");
        }

    }

    public static void parseDemoMethod() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str ;
        int iNum;
        int sum=0;

        System.out.println("Enter Numbers, negative number to quit.");

        do {


            try{
                str = bufferedReader.readLine();
                iNum = Integer.parseInt(str);
                if(iNum<0) {
                    System.out.println("Exiting with code 0....");
                    System.exit(0);
                }
            } catch (NumberFormatException nfe){

                System.out.println("Invalid format....");
                iNum=0;
            }
            sum+=iNum;
            System.out.println("Current Sum is: "+sum);
        } while (iNum >= 0);



    }
}
