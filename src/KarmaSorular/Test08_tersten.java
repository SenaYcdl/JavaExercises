package KarmaSorular;

import java.util.Scanner;

public class Test08_tersten {

    public static void main(String[] args) {

        /*Kullanıcının girdiği integer sayıyı tersten yazdıran
         kod bloğu yazınız.123==>321 yada 1045==>540

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi=scan.nextInt();

        while (sayi>0) {
            System.out.print(sayi%10);
            sayi/=10;
        }
    }
}
