package day12_Iterator;

import java.util.LinkedList;
import java.util.Scanner;

public class C06_LinkedList {
    public static void main(String[] args) {

        /*
ali veli can ve ayse olan bir linkedlist olusturun
kullanicidan bir isim alin
bu isim listde varsa silin ve kullaniciya
bu kullanici linkedliste vardi ve silindi
mesaji verin,bu isim linkedliste yoksa bu
isim linkedlist de yok bu yuzden silinemedi mesaji verin
 */

        LinkedList<String> list=new LinkedList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Can");

       Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz:");
        String isim=scan.nextLine();


        if (list.remove(isim)){
            System.out.println("Isim LinkedList de vardi ve silindi");
            System.out.println(list);
        } else {
            System.out.println("Isim LinkedList de yok, bu yuzden silinemedi");
            System.out.println(list);
        }
    }
}
