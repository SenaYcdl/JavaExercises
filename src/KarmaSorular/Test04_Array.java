package KarmaSorular;

import java.util.Arrays;

public class Test04_Array {

    public static void main(String[] args) {

        int [] sayilar={1232, 1134, 2345, 1022};

        String [] kelimeler= {"Java", "Python", "PHP", "C#",
                "C Programming" , "C++"};


        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));


        Arrays.sort(kelimeler);
        System.out.println(Arrays.toString(kelimeler));
    }
}
