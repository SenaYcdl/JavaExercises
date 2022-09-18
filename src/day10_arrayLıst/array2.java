package day10_arrayLıst;

public class array2 {
    public static void main(String[] args) {

        //Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
        //
        //Array: [1232,2345,5467,678,3454,2312,3451]



        int []arr={1232,2345,5467,678,3454,2312,3451};

        int enbuyuk=arr[0];
        int ikinci=0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]>enbuyuk){
                enbuyuk=arr[i];
            }else if (arr[i]>ikinci){
                ikinci=arr[i];
            }


        }
        System.out.println(ikinci);
    }
}
