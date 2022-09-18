package day7;

import java.util.Scanner;

import static day7.Q02_ExceptionsOdev.istenenSira;

public class Q08_tryCatch {

    static int istenenSira = 0;

    static String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};


    public static void main(String[] args) {


        boolean dongu = true;

        while (dongu) {
            try {
                UrunGir();
                dongu = false;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Alinan hata" + e);
                System.out.println("Lutfen 1 ve " + urunler.length + " arasi sayi giriniz");
            }

        }
    }

    private static void UrunGir() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz urunun sira nosunu giriniz");
        istenenSira=scan.nextInt();
        System.out.println(urunler[istenenSira]+ " nolu urun");

    }
}