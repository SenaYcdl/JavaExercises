package day13_replit;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_ListIterator {
    public static void main(String[] args) {

        //Soru 3) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …
        // Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        // output: [23,40]


        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        ListIterator<Integer> iterator= list.listIterator();
        int bas=20;
        int bitis=40;

        while(iterator.hasNext()) {
            int temp=iterator.next();

            if (temp<bas || temp>bitis ) {
                iterator.remove();
            }
        }


        System.out.println(list);



    }


}
