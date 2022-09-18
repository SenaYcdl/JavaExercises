package day12_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {
    public static void main(String[] args) {

        //listedeki elemanlara 5 ekleyerek yazdirin

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator<Integer> it= list.listIterator();


        while (it.hasNext()) {
            Integer temp=it.next()+5;
            it.set(temp);
        }

        System.out.println(list);
    }
}
