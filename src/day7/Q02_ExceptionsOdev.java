package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_ExceptionsOdev {


    static int istenenSira = 0;
    static String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

    public static void main(String[] args) {

        boolean dongu=true;
        while (dongu) {
            try {
                urunGir();
                dongu=false;
            } catch (Exception e) {
                System.out.println("Lutfen 1 ve "+urunler.length+" arasi sayi giriniz");
            }
        }
    }
    public static void urunGir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urunlerimiz : "+ Arrays.toString(urunler));
        System.out.println("Istediginiz urunun sira nosunu giriniz");
        istenenSira = scan.nextInt();
        System.out.println(urunler[istenenSira-1]+" nolu urun sepetinize eklendi...");
    }
}
