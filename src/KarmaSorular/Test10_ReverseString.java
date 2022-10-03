package KarmaSorular;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test10_ReverseString {
    public static void main(String[] args) {

        String name="sena";
        String reversed=new StringBuilder(name).reverse().toString();
        System.out.println(reversed);

        String[] arr={"nida"};
        Arrays.stream(arr).map(s->new StringBuilder(s).reverse().toString()).forEach(System.out::println);
        //List<String> result= Arrays.stream(arr).map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
        //System.out.println(result);
    }
}
