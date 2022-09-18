package day13_replit;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C07_ListIterator {
    public static void main(String[] args) {

        //Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin


        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(10);

        ListIterator<Integer> iterator=list.listIterator();
        while(iterator.hasNext()) {
            iterator.next();
        }

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous()+ " ");
        }

    }
}
