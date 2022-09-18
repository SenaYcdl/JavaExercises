package day10_arrayLıst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array3 {
    public static void main(String[] args) {

        //Bir String değişkeni cümlesi verildiğinde,
        // her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.


        String str="java is fun";

        String[]arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        List<String>arr2=new ArrayList<>();


        for (int i=arr.length-1; i>=0; i--) {
            arr2.add(arr[i]);

        }

        System.out.println(arr2);

    }
}
