package KarmaSorular;

import java.util.ArrayList;
import java.util.List;

public class Test07_Boom {
    public static void main(String[] args) {

        /*
        "Integer sayılardan oluşan bir diziyi parametre olarak alan  ve dizide 7 rakamı  var ise  "Boom!" ifadesini;
         aksi takdirde
         "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".
           Ornek çıktı:
           [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
           [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
           [2, 55, 60, 97, 86] ➞ "Boom!"
         */


        int [] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int [] arr2 = {8, 6, 33, 100};
        int [] arr3 = {2, 55, 60, 97, 86};
        int VarMi = 7;

        System.out.println(rakamDizideVarMi(arr1, VarMi));
        System.out.println(rakamDizideVarMi(arr2, VarMi));
        System.out.println(rakamDizideVarMi(arr3, VarMi));

    }

    public static String rakamDizideVarMi(int[] arr, int VarMi) {

        String sonuc;
        int basamak;
        List<Integer> tumSayilar = new ArrayList<>();

        for (int i : arr) {
            while (i != 0) {
                basamak = i % 10;
                tumSayilar.add(basamak);
                i = i / 10;
            }
        }

        if (tumSayilar.contains(VarMi)) {
            sonuc = "Boom!";
        } else {
            sonuc = "Dizide " + VarMi + " rakamı yok";
        }
        return sonuc;

    }
}
