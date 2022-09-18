package day10_arrayLıst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array {
    public static void main(String[] args) {


        //Array i ARRAYLIST e çeviren Java Kodunu yazınız.

        //Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]


        String[] arr = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }


        System.out.println(list);



        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2);



    }
}
