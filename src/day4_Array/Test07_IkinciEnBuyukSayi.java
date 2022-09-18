package day4_Array;

public class Test07_IkinciEnBuyukSayi {
    public static void main(String[] args) {

        /*
        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

          Array: [1232,2345,5467,678,3454,2312,3451]
         */

        int [] sayilar={1232,2345,5467,678,3454,2312,3451};

        int maxSayi = sayilar[0];
        int ikinci=sayilar[0];

        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > maxSayi) {
                ikinci=maxSayi;
                maxSayi=sayilar[i];

            } else if (sayilar[i] > ikinci) {
                ikinci=sayilar[i];

            }

        }

        System.out.println("Arraydeki en buyuk 2. sayi: " + ikinci);



    }
}
