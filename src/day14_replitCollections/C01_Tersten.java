package day14_replitCollections;

import java.util.*;

public class C01_Tersten {
    public static void main(String[] args) {

        /*
        Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.

LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

**hint:  Collections.swap();**

Beklene Çıktı:

Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]

Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
         */

        LinkedList<String> colors = new LinkedList<>();
        colors.add("mavi");
        colors.add("kirmizi");
        colors.add("beyaz");
        colors.add("siyah");
        colors.add("yesil");
        colors.add("turuncu");

        System.out.println("Before Swap: " + colors);

        Collections.swap(colors, 0, 3);
        System.out.println("After Swap:" + colors);


        /*
        try-catch cozumu
         throws Exception
        {

            try {

                // creating object of List<String>
                List<String> vector = new ArrayList<String>();

                // populate the vector
                vector.add("A");
                vector.add("B");
                vector.add("C");
                vector.add("D");
                vector.add("E");

                // printing the vector before swap
                System.out.println("Before swap: " + vector);

                // swap the elements
                System.out.println("\nSwapping 0th and 4th element.");
                Collections.swap(vector, 0, 4);

                // printing the vector after swap
                System.out.println("\nAfter swap: " + vector);
            }

            catch (IndexOutOfBoundsException e) {
                System.out.println("\nException thrown : " + e);
            }
        }
    }
         */
    }
}
