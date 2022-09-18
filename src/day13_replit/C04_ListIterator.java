package day13_replit;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {


        //String bir listedeki tum elementlerin sonuna X ekleyin

        List<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        ListIterator<String> ite= list.listIterator();
        while (ite.hasNext()) {
            ite.next();
            ite.add("x");
        }

        System.out.println(list);



        while (ite.hasPrevious()){
            System.out.print(ite.previous() + " ");
        }
    }
}
