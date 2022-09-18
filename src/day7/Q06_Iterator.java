package day7;

import java.util.Iterator;
import java.util.LinkedList;

public class Q06_Iterator {
    public static void main(String[] args) {

        /*
        Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

Beklenen Çıktı:
Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
Listenin ilk elemani: sari
listenin son elemani: beyaz
         */

        LinkedList<String> renkler = new LinkedList<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");
        renkler.add("siyah");
        renkler.add("yesil");
        renkler.add("beyaz");
        System.out.println(renkler);

        Iterator<String> renk = renkler.iterator();
        while (renk.hasNext()) {
            String color = renk.next();
            System.out.println(color);

        }

        for (int i = 0; i < renkler.size(); i++) {
            System.out.println(renkler.get(i));

        }
    }
}