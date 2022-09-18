package day12_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {

        //String bir listedeki tum elementlerin sonuna X ekleyin

        List<String> list = new ArrayList<String>();
        list.add("Je");
        list.add("ne");
        list.add("veux");
        list.add("pas");
        list.add("travailler");

        for (String each :list) {
            each=each + "x";

            System.out.println(each);
        }

        System.out.println(list);


        //ListIterator cozumu

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        System.out.println(list1); // [A, B, C, D]

        ListIterator<String> list2 =list1.listIterator();
        while (list2.hasNext()) {
            String temp=list2.next();
            list2.set(temp+"x");
        }

        System.out.println(list1);  // [Ax, Bx, Cx, Dx]
    }
}
