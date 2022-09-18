package day13_replit;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {
    public static void main(String[] args) {

        //listedeki elemanlara 5 ekleyerek yazdirin


        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(8);

        ListIterator<Integer> list2=list.listIterator();
        while(list2.hasNext()) {
            int temp=list2.next()+5;
            list2.set(temp);
        }

        System.out.println(list);
    }
}
