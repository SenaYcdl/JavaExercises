package day4_Array;

import java.util.Arrays;
import java.util.List;

public class Test06_ArrayArrayListYapma {
    public static void main(String[] args) {

        /*
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.

           Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
         */

        String [] kelimeler={ "Python","JAVA","PHP","Perl","C#","C++"};
        List<String> yenikelimeler= Arrays.asList(kelimeler);
        System.out.println(yenikelimeler);



    }
}
