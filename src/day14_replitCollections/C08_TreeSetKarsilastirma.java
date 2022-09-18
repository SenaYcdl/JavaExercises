package day14_replitCollections;

import java.util.*;

public class C08_TreeSetKarsilastirma {
    public static void main(String[] args) {

        /*
        Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek
         karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.

1. TreeSet: mavi,yesil,kirmizi,sari

2. TreeSet: yesil,mavi,pembe,turuncu
Beklenen Çıktı:
1. TreeSet: [kirmizi,mavi,sari,yesil]
2. TreeSet: [mavi,pembe,turuncu,yesil
Karsilastirma Sonucu:
no
yes
no
yes
         */

        TreeSet<String> colors=new TreeSet<String>();
        colors.add("mavi");
        colors.add("yesil");
        colors.add("kirmizi");
        colors.add("sari");
        System.out.println(colors);

        TreeSet<String> colors1=new TreeSet<String>();
        colors1.add("yesil");
        colors1.add("mavi");
        colors1.add("pembe");
        colors1.add("turuncu");
        System.out.println(colors1);

       ArrayList<String> ayni= new ArrayList<>();

        for(String each : colors)
            ayni.add(colors1.contains(each) ? "Yes" : "No");
        System.out.println(ayni);

    }
}

