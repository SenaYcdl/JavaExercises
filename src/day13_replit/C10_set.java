package day13_replit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C10_set {
    public static void main(String[] args) {

        Set<Object> set= new HashSet<>();
        set.add("A");
        set.add(2);
        set.add('c');
        set.add(true);

        System.out.println(set);

        List<Object> list= new ArrayList<>();
        list.add("B");
        list.add(true);
        list.add(false);
        list.add('d');

        System.out.println(list);

    }
}
