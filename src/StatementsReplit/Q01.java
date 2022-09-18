package StatementsReplit;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        //iki sayıyı kıyaslayan Java kodunu yazınınz.
        /*
        **Kullanılacak Operatörler**
**Büyüktür >**
**Küçüktür <**
**Büyük yada eşit =>**
**Küçük yada eşit =<**
**Eşittir ==**
**Eşit değildir !=**
**Kullanılacak sayılar 25 ile 39**
Beklenen Örnek Çıktı:
25 != 39
25 < 39
25 <= 39
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Iki tamsayi giriniz");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        if (num1>num2) {
            System.out.println(num1  + ">" + num2);
        } if (num1<num2) {
            System.out.println(num1 + "<" + num2);
        } if (num1>=num2) {
            System.out.println(num1 + ">=" + num2);
        } if (num1<=num2) {
            System.out.println(num1 + "<=" + num2);
        } if (num1==num2) {
            System.out.println(num1 + "=" + num2);
        } if (num1!=num2) {
            System.out.println(num1 + " != " + num2);
        } else
            System.out.println("Gcerli bir sayi giriniz");
    }
}
