package day12_Iterator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C07_Sets {
    public static void main(String[] args) {

        //verilen bir Arraydeki tekrar eden elemnetleri silip
//tekrarsız halini yazdirin

        String [] isimler={"Sena", "Nida", "Mustafa", "Ihsan", "Sena", "Mustafa"};

        Set<String> set=new HashSet<String>();

        for (String each:isimler) {
            set.add(each);
        }

        System.out.println(set);
        System.out.println(set.size()); // 4 tekrarlari silip veriyor

        // HashSet sirali verir
        //TreeSet normal verir
    }
}
