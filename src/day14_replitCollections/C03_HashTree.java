package day14_replitCollections;

import java.util.HashSet;
import java.util.TreeSet;

public class C03_HashTree {
    public static void main(String[] args) {

        /*
        HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.

HashSet List: sari,mavi,kirmizi,yesil,mor
Beklenen Çıktı:
TreeSet elements:
kirmizi
mavi
mor
sari
yesil
         */

        HashSet<String> colors=new HashSet<>();
        colors.add("sari");
        colors.add("mavi");
        colors.add("kirmizi");
        colors.add("yesil");
        colors.add("mor");

        TreeSet<String> col=new TreeSet<>(colors);

        for (String each:col) {

            System.out.println(each + " ");

        }


    }
}
