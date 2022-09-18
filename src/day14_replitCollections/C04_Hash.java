package day14_replitCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_Hash {
    public static void main(String[] args) {

        /*
        Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.

HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
Beklenen Çıktı:
Tree Set Elemanlari:
kirmizi
mavi
sari
turuncu
yesil
         */

        Set<String> colors=new HashSet<>();
        colors.add("sari");
        colors.add("mavi");
        colors.add("yesil");
        colors.add("turuncu");
        colors.add("kirmizi");

        System.out.println("HashSet elements:" + colors);


        TreeSet<String> col=new TreeSet<>(colors);

        for (String each: col) {

            System.out.println(each);
        }
    }
}
