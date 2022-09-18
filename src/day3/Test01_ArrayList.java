package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01_ArrayList {
    public static void main(String[] args) {

        String str="Javaisalsoeasy";
        List<String> list=duplicate(str);
        System.out.println(list);
    }
    private static List<String> duplicate(String str) {
        String [] arr=str.split("");
        Arrays.sort(arr);
        List<String> ikileme = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i].equals(arr[i+1])&&!ikileme.contains(arr[i])){
                ikileme.add(arr[i]);

            }
        }



        return ikileme;
    }
    }

