package day12_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {
    public static void main(String[] args) {


        //Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin


        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");

        }
    }
}
