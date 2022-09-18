package day3;

public class Test02_Array {
    public static void main(String[] args) {

        /*
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

          Beklenen Çıktı:
      0  0  0  0  0  0  0  0  0  0
      0  0  0  0  0  0  0  0  0  0
      0  0  0  0  0  0  0  0  0  0
      0  0  0  0  0  0  0  0  0  0
      0  0  0  0  0  0  0  0  0  0
      0  0  0  0  0  0  0  0  0  0
      0  0  0  0  0  0  0  0  0  0
      0  0  0  0  0  0  0  0  0  0
      0  0  0  0  0  0  0  0  0  0
       0  0  0  0  0  0  0  0  0  0
         */



        int yukseklik[] ={0,0,0,0,0,0,0,0,0,0};
        int boy [] ={0,0,0,0,0,0,0,0,0,0};


        for (int i=1; i<=yukseklik.length; i++) {
            for (int j=1; j<=boy.length; j++) {
                System.out.print("0 ");
            }
            System.out.println(" ");
        }

    }
}
