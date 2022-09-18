package KarmaSorular;

import java.util.Random;

public class Test06_Random {
    public static void main(String[] args) {

        /*
        Örnek 1: 0 ile 30 arasında 10 adet rastgele tamsayı üreten ve
        bu sayıları ekranda gösteren Java kodunu yazınız.
         */

        for (int i=0; i<10;i++)
        {
            Random rnd = new Random();
            System.out.print(rnd.nextInt(20)+"\t");
        }
    }
}
