package day14_replitCollections;

import java.util.PriorityQueue;

public class C09_PriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<String> colors=new PriorityQueue<String>(); //natural order
        colors.add("sari");
        colors.add("yesil");
        colors.add("mavi");
        colors.add("kirmizi");
        System.out.println(colors);
    }
}
