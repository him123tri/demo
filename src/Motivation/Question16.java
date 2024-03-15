package Motivation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question16 {

    public static void main(String[] args) {

        String s ="bbabbacc";
        char c [] = s.toCharArray();
        int i=0;
        int j= c.length-1;
        int min =0;
        int max =0;
        List<Integer> list = new ArrayList<>();

        while (i<j){
            if (c[i] == c[j]){
                min =i;
                max =j;
                i++;
                j--;
                list.add(min);
                list.add(max);
            }
            else{
                min =0;
                max =0;
                list.clear();
                i++;
                j--;

            }
        }

        String x = s.substring(min,max+1);
        System.out.println(x);
    }
}
