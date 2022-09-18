package day10_arrayLıst;

import java.util.Scanner;

public class ArrayBınary {
    public static void main(String[] args) {


        //Kullanıcının gireceği iki binary sayıyı toplayan Java kodunu yazınız.
        //
        //Test Data:
        //birinci binary number: 100010
        //ikinci  binary number: 110010
        //Beklenen Çıktı:
        //1010100

        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];

        Scanner in = new Scanner(System.in);
        binary1 = in.nextLong();
        binary2 = in.nextLong();
        while(binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder   = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 /= 10;
            binary2 /= 10;
        }
        if(remainder != 0)
        {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("\nToplam = ");
        while(i >= 0)
        {
            System.out.print(sum[i--]);
        }
        System.out.println();
    }
}


