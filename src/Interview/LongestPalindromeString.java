package Interview;

import java.util.ArrayList;
import java.util.Collections;

public class LongestPalindromeString {

    public static void main(String[] args) {

        String str = "bbabbacc";
        char [] c = str.toCharArray();
        ArrayList <Integer> l = new ArrayList<>();
        int i =0;
        int j = c.length-1;
        int min = 0;
        int max =0;

        while (i<j){
            if (str.charAt(i) != str.charAt(j) ){
                i++;
                j--;
                l.clear();
                min =0;
                max =0;
            }
            else{
                min = i;
                max = j;
                l.add(i);
                l.add(j);
                i++;
                j--;
            }
            Collections.sort(l);

        }

        min = l.get(0);
        max = l.get(l.size()-1);
        System.out.println(str.substring(min,max+1));


    }
}
