package day12_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        //bir listedeki tum elementleri Iterator kullanarak silin

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        Iterator<String>  list1=list.iterator(); //ArrayList i Iterator liste atadik
        while(list1.hasNext()) { //while dongusu ile butun elemanlari aldik ve hasNext ile bir yana kaydirdik
            list1.next(); //next methoduyla bir sonraki elemani al
            list1.remove(); //remove ile sil
        }

        System.out.println(list);
    }
}
