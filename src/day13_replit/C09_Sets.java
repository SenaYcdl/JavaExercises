package day13_replit;

import java.util.*;

public class C09_Sets {
    public static void main(String[] args) {

        //verilen bir Arraydeki tekrar eden elemnetleri silip
       //tekrarsız halini yazdirin


        int [] arr ={1,4,7,8,2,5,6,4,1,2};

        Set<Integer> set=new HashSet<>(); // hem siraya dizer hem de tekrarsız yazdirir

        for (int each:arr) {
            set.add(each);

        }

        System.out.println(set);



    }
}
