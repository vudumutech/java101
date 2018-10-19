package com.slokashri.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedListExample1.addDelete();
    }

    private static void addDelete(){

        LinkedList<String> linkedList1 = new LinkedList<>();

        linkedList1.add("Vidya");
        linkedList1.add("Rahul");
        linkedList1.add("Vijay");
        linkedList1.add("Khalid");
        System.out.println("Initial linkedList1: "+linkedList1);

        linkedList1.add(2,"Vandana");
        System.out.println("After adding Vandana at 2: linkedList1: "+linkedList1);

        linkedList1.addFirst("Head to delete!");
        System.out.println("After adding at the first location: "+linkedList1);

        linkedList1.addLast("Tail to delete!");
        System.out.println("After adding at the last location: "+linkedList1);

        System.out.println("peek(): " + linkedList1.peek());
        System.out.println("peekFirst(): " + linkedList1.peekFirst());
        System.out.println("getFirst(): " + linkedList1.getFirst());
        System.out.println("Current State of linkedList1: "+linkedList1);

        System.out.println("poll(): " + linkedList1.poll());
        System.out.println("pollFirst(): " + linkedList1.pollFirst());
        System.out.println("pop(): " + linkedList1.pop());
        System.out.println("Current State of linkedList1: "+linkedList1);

        linkedList1.push("PUSHED ITEM");
        System.out.println("After push(): " + linkedList1);

        System.out.println("pollLast(): " + linkedList1.pollLast());
        System.out.println("Current State of linkedList1: "+linkedList1);
        System.out.println("peekLast(): " + linkedList1.peekLast());
        System.out.println("Current State of linkedList1: "+linkedList1);

        System.out.println("Iterator------------");
        Iterator<String> stringIterator = linkedList1.iterator();
        while (stringIterator.hasNext()){
            System.out.print(stringIterator.next() + " ");
        }
        System.out.println("");
        System.out.println("Descending Iterator------------");

        stringIterator = linkedList1.descendingIterator();
        while (stringIterator.hasNext()){
            System.out.print(stringIterator.next() + " ");
        }


    }
}
