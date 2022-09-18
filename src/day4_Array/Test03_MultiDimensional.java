package day4_Array;

public class Test03_MultiDimensional {
    public static void main(String[] args) {

        int dizi[][] = { {16,21,33},{67,90,11},{39,10,98},{18,76,87}};

        //for döngüleri ile satır ve sütunlara elemanları yazmasını sağladık.
        for (int i=0; i< 4 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(dizi[i][j] + " ");

            System.out.println();
        }
    }
}
