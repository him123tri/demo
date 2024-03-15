package Motivation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {

        String first = "Ravi";
        String second = "RavTeja";

        char [] c = first.toCharArray();
        char [] c1 = second.toCharArray();

        ArrayList<Character> list = new ArrayList<>();

        for (int i=0; i<first.length(); i++){
            if (c[i] == c1[i]){
                list.add(c[i]);
            }
        }
        System.out.println(list);
    }
}
