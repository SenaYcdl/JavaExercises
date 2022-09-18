package day13_replit;

import java.util.*;

public class C08_LinkedList {
    public static void main(String[] args) {



           /*
ali veli can ve ayse olan bir linkedlist olusturun
kullanicidan bir isim alin
bu isim listde varsa silin ve kullaniciya
bu kullanici linkedliste vardi ve silindi
mesaji verin,bu isim linkedliste yoksa bu
isim linkedlist de yok bu yuzden silinemedi mesaji verin
 */


        LinkedList<String> list = new LinkedList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        list.add("Ayse");

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz:");
        String isim = scan.nextLine();

        if (list.contains(isim)) {
            list.remove(isim);
            System.out.println("Girdiginiz isim LinkedList vardi ve silindi");
        } else {
            System.out.println("Isim listede yoktur, bu yuzden silenemedi");
        }

        System.out.println(list);

    }
}
