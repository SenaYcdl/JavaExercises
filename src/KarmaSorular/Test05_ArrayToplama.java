package KarmaSorular;

public class Test05_ArrayToplama {
    public static void main(String[] args) {

        int [] sayilar= {1,2,3,4,5,6,7,8,9,10};

        int toplam=0;

        for( int sayi : sayilar) {
            toplam = toplam+sayi;
        }
        System.out.println("Array toplami: " + toplam);



    }
}
