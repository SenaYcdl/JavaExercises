package day7;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {
    public static void main(String[] args) {

        /*
        Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.

          ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

            Beklenen Çıktı:
           Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
            siyah
           mavi
           kirmizi
           yesil
            mor
         */

        List<String> renkler=new ArrayList<>();
        renkler.add("siyah");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("yesil");
        renkler.add("mor");
        renkler.add("turuncu");
        System.out.println(renkler);
        System.out.println(renkler.size());
        System.out.println(renkler.get(0));
    }
}
