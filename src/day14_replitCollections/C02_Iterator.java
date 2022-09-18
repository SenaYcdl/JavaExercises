package day14_replitCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class C02_Iterator {
    public static void main(String[] args) {

        /*
        Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
Beklenen Çıktı:
Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
Listenin ilk elemani: sari
listenin son elemani: beyaz
         */

        LinkedList<String> list=new LinkedList<String>();
        list.add("sari");
        list.add("mavi");
        list.add("turuncu");
        list.add("siyah");
        list.add("yesil");
        list.add("beyaz");

        ListIterator<String> ite=list.listIterator();
        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());


    }
}
