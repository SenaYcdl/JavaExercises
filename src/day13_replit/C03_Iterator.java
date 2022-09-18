package day13_replit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {

        //bir listedeki tum elementleri Iterator kullanarak silin

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        Iterator<Integer> list2= list.iterator();
        while (list2.hasNext()) {
            list2.next();
            list2.remove();

        }
        System.out.println(list);

    }
}
