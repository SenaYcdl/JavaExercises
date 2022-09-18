package day14_replitCollections;

import java.util.TreeSet;

public class C07_TreeSet {
    public static void main(String[] args) {

        //Bir TreeSet oluşturalım ve Tree Listesini ve
        // listedeki eleman sayısını yazdıran java kodunu yazdıralım.


        TreeSet<String> colors=new TreeSet<>();
        colors.add("yesil");
        colors.add("sari");
        colors.add("mavi");
        colors.add("kirmizi");
        colors.add("pembe");

        System.out.println(colors);
        System.out.println(colors.size());
    }
}
