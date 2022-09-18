package day4_Array;

import java.util.Arrays;

public class Test05_Sort {
    public static void main(String[] args) {

        int [] dizi = {5,6,16,55,34,42,35,11};
        Arrays.sort(dizi);//Dizi sıralama işlemi yapıldı
        for (int i=0; i<dizi.length; i++)//Döngümüzdeki koşulu ve artış miktarını girdik
        {
            System.out.print(dizi[i]+" ");
        }

    }
}
