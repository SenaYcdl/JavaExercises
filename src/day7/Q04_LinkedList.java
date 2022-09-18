package day7;

import java.util.LinkedList;

public class Q04_LinkedList {
    public static void main(String[] args) {

        /*
        Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

         LinkedList elemanları: sari,mavi,mor,yesil,beyaz

          Beklenen Çıktı:
           sari
           mavi
           mor
           yesil
           beyaz
         */


        LinkedList<String> renkler=new LinkedList<>();
        renkler.addFirst("sari");
        renkler.add("mavi");
        renkler.add("mor");
        renkler.add("yesil");
        renkler.addLast("beyaz");

        System.out.println(renkler);
        System.out.println(renkler.size());
        System.out.println(renkler.get(0));
        System.out.println(renkler.get(1));
        System.out.println(renkler.get(2));
        System.out.println(renkler.get(3));
        System.out.println(renkler.get(4));

    }
}
