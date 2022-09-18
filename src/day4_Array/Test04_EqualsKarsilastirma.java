package day4_Array;

import java.util.Arrays;

public class Test04_EqualsKarsilastirma {
    public static void main(String[] args) {

        //Dizilerimize sayılar tanımladık.
        int [] dizi = {52,99,23,43};
        int [] dizi2 = {52,99,23,43};
        int [] dizi3 = {52,22,23,43};
        System.out.println(Arrays.equals(dizi, dizi2));//dizi ile dizi2'yi karşılaştırdık ve sonuç true.
        System.out.println(Arrays.equals(dizi2, dizi3));//dizi2 ile dizi3'ü karşılaştırdık ve sonuç false.

    }
}
