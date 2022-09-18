package StatementsReplit;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        //1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve
        //o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.

        Scanner input = new Scanner(System.in);
        int gun = 0;
        String ayAdi = "";
        System.out.print("ay giriniz: ");
        int ay= input.nextInt();
        System.out.print("yil giriniz: ");
        int yil = input.nextInt();

        switch (ay) {
            case 1:
                ayAdi = "Ocak";
                gun = 31;
                break;
            case 2:
                ayAdi = "Subat";
                if ((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0))) {
                    gun = 29;
                } else {
                    gun = 28;
                }
                break;
            case 3:
                ayAdi = "Mart";
                gun = 31;
                break;
            case 4:
                ayAdi = "Nisan";
                gun = 30;
                break;
            case 5:
                ayAdi = "Mayis";
                gun = 31;
                break;
            case 6:
                ayAdi = "Haziran";
                gun = 30;
                break;
            case 7:
                ayAdi = "Temmuz";
                gun = 31;
                break;
            case 8:
                ayAdi = "Agustos";
                gun = 31;
                break;
            case 9:
                ayAdi = "Eylul";
                gun = 30;
                break;
            case 10:
                ayAdi = "Ekim";
                gun = 31;
                break;
            case 11:
                ayAdi = "Kasim";
                gun = 30;
                break;
            case 12:
                ayAdi = "Aralik";
                gun = 31;
                break;
        }
        System.out.print(ayAdi + " " + yil + "  " + gun + " gundur\n");
    }
}