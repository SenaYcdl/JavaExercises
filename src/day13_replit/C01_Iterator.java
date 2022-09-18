package day13_replit;

import java.util.LinkedList;
import java.util.ListIterator;

public class C01_Iterator {
    public static void main(String[] args) {


        //Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
        //LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
        //Beklenen Çıktı:
        //Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
        //LinkedList Tersi:
        //mor
        //beyaz
        //kirmizi
        //yesil
        //mavi
        //sari


        LinkedList<String> renkler=new LinkedList<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add("mor");
        System.out.println(renkler);

        ListIterator<String> ite=renkler.listIterator();

        while(ite.hasNext()) {
            ite.next();
        }

        while(ite.hasPrevious()){
            System.out.print(ite.previous() + " ");
        }
    }
}
