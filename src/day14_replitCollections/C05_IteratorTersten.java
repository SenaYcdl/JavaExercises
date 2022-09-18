package day14_replitCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class C05_IteratorTersten {
    public static void main(String[] args) {

        /*
        Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından descendingIterator() fonksiyonunu kullanarak ters sıradan yazdıralım.

TreeSet elemanları: yesil,sari,mavi,turuncu,kirmizi

Beklenen Çıktı:
Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
Tersten Siralanisi:
yesil
turuncu
sari
mavi
kirmizi
         */

        TreeSet<String> colors=new TreeSet<>();
        colors.add("yesil");
        colors.add("sari");
        colors.add("mavi");
        colors.add("turuncu");
        colors.add("kirmizi");
        System.out.println(colors);

        Iterator list=colors. descendingIterator();
        while (list.hasNext()) {
            System.out.println(list.next());

        }
    }
}
