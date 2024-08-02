package day31_iteratorCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Deneme {

    public static void main(String[] args) {

     Queue <Integer> q1=new LinkedList<>();

     q1.add(10);
     q1.add(30);
     q1.add(40);
     q1.add(520);
     q1.add(5023);
     q1.add(504);
     q1.add(54120);

        q1.offer(99);

        System.out.println( q1);
        System.out.println();

        System.out.println(q1.peek());
        System.out.println();
        q1.poll();
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
     }
        }

