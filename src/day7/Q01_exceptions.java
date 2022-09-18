package day7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q01_exceptions {
    public static void main(String[] args) {


        /*
        marketteki tum urunleri bir array de tuttugumuzu varsayalim
        kullaniciya index sorup, o index deki urunu yazdiran bir program hazirlayalim
        kullanici urun sayisindan buyuk bir index girerse
        exception vermesinin onune gecelim
         */

        String [] urunler={"Nutella" , "Cokokrem", "Sut", "Cay", "Findik"};

        Scanner scan=new Scanner(System.in);
        System.out.println("Istediginiz urunun sira nosunu giriniz");


        int istenenSira=0;

        try {
            istenenSira =scan.nextInt();
        } catch (InputMismatchException deneme) {
            System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
            System.out.println(deneme);
        }

        /*
         catch blogunun onundeki parantezde
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)
         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz
         bu objeyi kullanabilirsiniz
         eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         */

        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenSira-1] );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nSira numarasi en fazla : " + urunler.length  + " olabilir" );
        }
    }
}

