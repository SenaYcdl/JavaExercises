package day7;

import java.util.LinkedList;
import java.util.ListIterator;

public class Q05_LinkedList {
    public static void main(String[] args) {

        /*
        bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

        LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

      1.elemandan itibaren yazdıralım.
      Beklenen Çıktı:
          beyaz
          mavi
           yesil
           turuncu

           next() : ileri doğru
          previous(): geri doğru
          hasNext(): ileride eleman varmı?
          hasPrevious(): geride elaman varmı? true yada false
         */

        LinkedList<String> renkler=new LinkedList<>();
        renkler.add("sari");
        renkler.add("beyaz");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("turuncu");
        renkler.removeFirst();
        System.out.println(renkler);


        ListIterator<String> iterator=renkler.listIterator();
        System.out.println("Bastan sona yazdiralim: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Sondan basa yazdiralim:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
